package C9067_HARDDBCONACC__HardCodingDBConnectionAccount;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class DBConnectionManager
{
    static private DBConnectionManager instance; // The single instance
    static private int clients;

    private Vector drivers = new Vector();
    private PrintWriter log;
    private Hashtable pools = new Hashtable();

    static synchronized public DBConnectionManager getInstance()
    {
        if (instance == null)
            instance = new DBConnectionManager();
        clients++;
        return instance;
    }

    private DBConnectionManager()
    {
        init();
    }

    public void freeConnection(String name, Connection con)
    {
        DBConnectionPool pool = (DBConnectionPool) pools.get(name);
        if (pool != null)
            pool.freeConnection(con);
    }

    public Connection getConnection(String name)
    {
        DBConnectionPool pool = (DBConnectionPool) pools.get(name);
        if (pool != null)
            return pool.getConnection();

        return null;
    }

    public Connection getConnection(String name, long time)
    {
        DBConnectionPool pool = (DBConnectionPool) pools.get(name);
        if (pool != null)
            return pool.getConnection(time);

        return null;
    }

    // Closes all open connections and deregisters all drivers.
    public synchronized void release()
    {
        // Wait until called by the last client
        if (--clients != 0)
            return;

        Enumeration allPools = pools.elements();
        while (allPools.hasMoreElements())
        {
            DBConnectionPool pool = (DBConnectionPool) allPools.nextElement();
            pool.release();
        }

        Enumeration allDrivers = drivers.elements();
        while (allDrivers.hasMoreElements())
        {
            Driver driver = (Driver) allDrivers.nextElement();
            try
            {
                DriverManager.deregisterDriver(driver);
                log("Deregistered JDBC driver " + driver.getClass().getName());
            }
            catch (SQLException e) { log(e, "Can't deregister JDBC driver: " + driver.getClass().getName()); }
        }
    }

    private void createPools(Properties props)
    {
        Enumeration propNames = props.propertyNames();
        while (propNames.hasMoreElements())
        {
            String name = (String) propNames.nextElement();
            if (name.endsWith(".url"))
            {
                String poolName = name.substring(0, name.lastIndexOf("."));
                String url = props.getProperty(poolName + ".url");
                if (url == null)
                {
                    log("No URL specified for " + poolName);
                    continue;
                }
                String user = props.getProperty(poolName + ".user");
                String password = props.getProperty(poolName + ".password");
                String maxconn = props.getProperty(poolName + ".maxconn", "0");
                int max;
                try
                {
                    max = Integer.valueOf(maxconn).intValue();
                }
                catch (NumberFormatException e)
                {
                    log("Invalid maxconn value " + maxconn + " for " + poolName);
                    max = 0;
                }
                DBConnectionPool pool = new DBConnectionPool(poolName, url, user, password, max);
                pools.put(poolName, pool);
                log("Initialized pool " + poolName);
            }
        }
    }

    // Loads properties and initializes the instance with its values.
    private void init()
    {
        InputStream is = getClass().getResourceAsStream("db.properties");
        Properties dbProps = new Properties();
        try
        {
            dbProps.load(is);
        }
        catch (Exception e)
        {
            System.err.println("Can't read the properties file. " + "Make sure db.properties is in the CLASSPATH");
            return;
        }
        String logFile = dbProps.getProperty("logfile", "DBConnectionManager.log");
        try
        {
            log = new PrintWriter(new FileWriter(logFile, true), true);
        }
        catch (IOException e)
        {
            System.err.println("Can't open the log file: " + logFile);
            log = new PrintWriter(System.err);
        }
        loadDrivers(dbProps);
        createPools(dbProps);
    }

    private void loadDrivers(Properties props)
    {
        String driverClasses = props.getProperty("drivers");
        StringTokenizer st = new StringTokenizer(driverClasses);
        while (st.hasMoreElements())
        {
            String driverClassName = st.nextToken().trim();
            try
            {
                Driver driver = (Driver) Class.forName(driverClassName).newInstance();
                DriverManager.registerDriver(driver);
                drivers.addElement(driver);
                log("Registered JDBC driver " + driverClassName);
            }
            catch (Exception e) { log("Can't register JDBC driver: " + driverClassName + ", Exception: " + e); }
        }
    }

    // Writes a message to the log file.
    private void log(String msg)
    {
        log.println(new Date() + ": " + msg);
    }

    // Writes a message with an Exception to the log file.
    private void log(Throwable e, String msg)
    {
        log.println(new Date() + ": " + msg);
        e.printStackTrace(log);
    }


    class DBConnectionPool
    {
        private int checkedOut;
        private Vector freeConnections = new Vector();
        private int maxConn;
        private String name;
        private String password;
        private String URL;
        private String user;

        public DBConnectionPool(String name, String URL, String user, String password, int maxConn)
        {
            this.name = name;
            this.URL = URL;
            this.user = user;
            this.password = password;
            this.maxConn = maxConn;
        }

        public synchronized void freeConnection(Connection con)
        {
            // Put the connection at the end of the Vector
            freeConnections.addElement(con);
            checkedOut--;
            notifyAll();
        }

        public synchronized Connection getConnection()
        {
            Connection con = null;
            if (freeConnections.size() > 0)
            {
                // Pick the first Connection in the Vector to get round-robin usage
                con = (Connection) freeConnections.firstElement();
                freeConnections.removeElementAt(0);
                try
                {
                    if (con.isClosed())
                    {
                        log("Removed bad connection from " + name);
                        con = getConnection(); // Try again recursively
                    }
                }
                catch (SQLException e)
                {
                    log("Removed bad connection from " + name);
                    con = getConnection(); // Try again recursively
                }
            }
            else if (maxConn == 0 || checkedOut < maxConn)
                con = newConnection();

            if (con != null)
                checkedOut++;

            return con;
        }

        public synchronized Connection getConnection(long timeout)
        {
            long startTime = new Date().getTime();
            Connection con;
            while ((con = getConnection()) == null)
            {
                try
                {
                    wait(timeout);
                }
                catch (InterruptedException e) { }

                if ((new Date().getTime() - startTime) >= timeout)
                    return null; // Timeout has expired
            }
            return con;
        }

        // Closes all available connections.
        public synchronized void release()
        {
            Enumeration allConnections = freeConnections.elements();
            while (allConnections.hasMoreElements())
            {
                Connection con = (Connection) allConnections.nextElement();
                try
                {
                    con.close();
                    log("Closed connection for pool " + name);
                }
                catch (SQLException e) { log(e, "Can't close connection for pool " + name); }
            }
            freeConnections.removeAllElements();
        }

        // Creates a new connection, using a userid and password if specified.
        private Connection newConnection()
        {
            Connection con = null;
            try
            {
                if (user == null)
                    con = DriverManager.getConnection(URL);
                else
                    con = DriverManager.getConnection(URL, user, password);

                log("Created a new connection in pool " + name);
            }
            catch (SQLException e)
            {
                log(e, "Can't create a new connection for " + URL);
                return null;
            }
            return con;
        }
    }
}