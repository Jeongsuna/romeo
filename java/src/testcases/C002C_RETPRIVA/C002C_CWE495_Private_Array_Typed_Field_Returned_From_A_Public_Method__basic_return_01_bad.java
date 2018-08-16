package testcases.C002C_RETPRIVA;/*
Filename : CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__basic_return_01_bad.java
*/



import testcasesupport.*;

public class C002C_CWE495_Private_Array_Typed_Field_Returned_From_A_Public_Method__basic_return_01_bad
{


    private byte[] foo = null;
    public byte[] getFoo()
    {
		/* FLAW */
        return foo;
    }

    public void bad() throws Throwable

    {
        /* FLAW */
        byte[] tmp_data = getFoo();
    }

}

