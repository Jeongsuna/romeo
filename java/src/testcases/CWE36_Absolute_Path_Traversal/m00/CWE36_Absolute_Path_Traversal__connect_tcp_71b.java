/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE36_Absolute_Path_Traversal__connect_tcp_71b.java
Label Definition File: CWE36_Absolute_Path_Traversal.label.xml
Template File: sources-sink-71b.tmpl.java
*/
/*
 * @description
 * CWE: 36 Absolute Path Traversal
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : read line from file from disk
 * Flow Variant: 71 Data flow: data passed as an Object reference argument from one method to another in different classes in the same package
 *
 * */

package testcases.CWE36_Absolute_Path_Traversal.m00;

import testcasesupport.*;

import java.io.*;
import javax.servlet.http.*;

import java.util.logging.Level;

public class CWE36_Absolute_Path_Traversal__connect_tcp_71b
{
    public void badSink(Object dataObject ) throws Throwable
    {
        String data = (String)dataObject;

        /* POTENTIAL FLAW: unvalidated or sandboxed value */
        if (data != null)
        {
            File file = new File(data);
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if (file.exists() && file.isFile())
            {
                try
                {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* Close stream reading objects */
                    try
                    {
                        if (readerBufferdSink != null)
                        {
                            readerBufferdSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStreamSink != null)
                        {
                            readerInputStreamSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try
                    {
                        if (streamFileInputSink != null)
                        {
                            streamFileInputSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(Object dataObject ) throws Throwable
    {
        String data = (String)dataObject;

        /* POTENTIAL FLAW: unvalidated or sandboxed value */
        if (data != null)
        {
            File file = new File(data);
            FileInputStream streamFileInputSink = null;
            InputStreamReader readerInputStreamSink = null;
            BufferedReader readerBufferdSink = null;
            if (file.exists() && file.isFile())
            {
                try
                {
                    streamFileInputSink = new FileInputStream(file);
                    readerInputStreamSink = new InputStreamReader(streamFileInputSink, "UTF-8");
                    readerBufferdSink = new BufferedReader(readerInputStreamSink);
                    IO.writeLine(readerBufferdSink.readLine());
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
                }
                finally
                {
                    /* Close stream reading objects */
                    try
                    {
                        if (readerBufferdSink != null)
                        {
                            readerBufferdSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
                    }

                    try
                    {
                        if (readerInputStreamSink != null)
                        {
                            readerInputStreamSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                    }

                    try
                    {
                        if (streamFileInputSink != null)
                        {
                            streamFileInputSink.close();
                        }
                    }
                    catch (IOException exceptIO)
                    {
                        IO.logger.log(Level.WARNING, "Error closing FileInputStream", exceptIO);
                    }
                }
            }
        }

    }
}
