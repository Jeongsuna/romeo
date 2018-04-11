/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE36_Absolute_Path_Traversal__connect_tcp_54c.java
Label Definition File: CWE36_Absolute_Path_Traversal.label.xml
Template File: sources-sink-54c.tmpl.java
*/
/*
 * @description
 * CWE: 36 Absolute Path Traversal
 * BadSource: connect_tcp Read data using an outbound tcp connection
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : read line from file from disk
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */

package testcases.CWE36_Absolute_Path_Traversal.m00;

import java.io.*;
import javax.servlet.http.*;

public class CWE36_Absolute_Path_Traversal__connect_tcp_54c
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__connect_tcp_54d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE36_Absolute_Path_Traversal__connect_tcp_54d()).goodG2BSink(data );
    }
}
