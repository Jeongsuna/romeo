/*
Filename : CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__basic_return_01_bad.java
*/



import testcasesupport.*;

public class C002C_CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__basic_return_01_bad extends AbstractTestCase
{


    private byte[] foo = null;
    public byte[] getFoo()
    {
		/* FLAW */
        return foo;
    }

    public void bad() throws Throwable
    {
        byte[] tmp_data = getFoo();
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

