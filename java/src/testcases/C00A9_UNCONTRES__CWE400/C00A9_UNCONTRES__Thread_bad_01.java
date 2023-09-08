package testcases.C00A9_UNCONTRES__CWE400;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C00A9_UNCONTRES__Thread_bad_01 {
    public static final int SERVER_PORT = 4444;
    public void acceptConnections() {
        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            int counter = 0;
            boolean hasConnections = true;
            while (hasConnections) {
                Socket client = serverSocket.accept();
                Thread t = new Thread(new ClientSocketThread(client));
                t.setName(client.getInetAddress().getHostName() + ":" + counter++);
                t.start();
            }
            serverSocket.close();


        } catch (IOException ex) {}
    }

}
