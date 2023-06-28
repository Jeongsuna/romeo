/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE321_Hard_Coded_Cryptographic_Key__basic_01.java
Label Definition File: CWE321_Hard_Coded_Cryptographic_Key__basic.label.xml
Template File: sources-sink-01.tmpl.java
*/
/*
* @description
* CWE: 321 Hard coded crypto key
* BadSource:  Set data to a hardcoded value
* GoodSource: Read data from the console using readLine()
* BadSink:  Use data as a cryptographic key
* Flow Variant: 01 Baseline
*
* */

package testcases.C0019_HARDKEY__CWE321_Hard_Coded_Cryptographic_Key.s02;

import testcasesupport.*;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.logging.Level;

import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;

/**
 * 한국주택공사(LH) 오탐 예제
 */
public class C7002_HARDINFO_CWE321_Hard_Coded_Cryptographic_Key_example extends AbstractTestCase
{
    /* uses badsource and badsink */
    public void bad() throws Throwable
    {
        String data;

        /* FLAW: Set data to a hardcoded value */
        data = "23 ~j;asn!@#/>as";

        if (data != null)
        {
            String stringToEncrypt = "Super secret Squirrel";
            byte[] byteStringToEncrypt = stringToEncrypt.getBytes(StandardCharsets.UTF_8);
            /* POTENTIAL FLAW: Use data as a cryptographic key */
            SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher aesCipher = Cipher.getInstance("AES");
            aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
            IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
        }

    }

    public void good() throws Throwable
    {
        goodG2B();
    }

    /* goodG2B() - uses goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        String data;

        /* read user input from console with readLine */
        try
        {
            InputStreamReader readerInputStream = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader readerBuffered = new BufferedReader(readerInputStream);

            /* FIX: Read data from the console using readLine() */
            data = readerBuffered.readLine();

            if (data != null)
            {
                String stringToEncrypt = "Super secret Squirrel";
                byte[] byteStringToEncrypt = stringToEncrypt.getBytes(StandardCharsets.UTF_8);
                // NON-POTENTIAL
                SecretKeySpec secretKeySpec = new SecretKeySpec(data.getBytes(StandardCharsets.UTF_8), "AES");
                Cipher aesCipher = Cipher.getInstance("AES");
                aesCipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
                byte[] byteCipherText = aesCipher.doFinal(byteStringToEncrypt);
                IO.writeLine(IO.toHex(byteCipherText)); /* Write encrypted data to console */
            }
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }


    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}

