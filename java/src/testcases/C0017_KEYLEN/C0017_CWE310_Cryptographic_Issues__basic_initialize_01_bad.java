package testcases.C0017_KEYLEN;/*
Filename : CWE310_Cryptographic_Issues__basic_initialize_01_bad.java
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

public class C0017_CWE310_Cryptographic_Issues__basic_initialize_01_bad
{

    
    public void bad() throws Throwable
    {
        KeyPairGenerator kpGen = KeyPairGenerator.getInstance("RSA");
        /* FLAW */
        kpGen.initialize(512);
        KeyPair          pair = kpGen.generateKeyPair();


    }

}

