/*
Filename : CWE310_Cryptographic_Issues__basic_initialize_01_good.java
*/



import testcasesupport.*;

import java.io.OutputStreamWriter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;


import javax.servlet.http.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;

import java.util.logging.Logger;

public class C0017_CWE310_Cryptographic_Issues__basic_initialize_01_good extends AbstractTestCase
{

    
    public void good() throws Throwable
    {
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
        /* FIX */
        kpGen.initialize(2048);
        KeyPair          pair = kpGen.generateKeyPair();


    }


    

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

