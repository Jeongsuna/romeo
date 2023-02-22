package C9086_STRBUFCONSTARG__StringBufferConstructorArgument;

public class C9086_STRBUFCONSTARG_StringBufferConstructorArgument_bad {

    public void badMethod(int param) {
        StringBuffer buffer = new StringBuffer("Line No" + param); // @violation
    }
}
