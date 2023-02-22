package C8105_InefficientStringBuffering__StringBufferConstructorArgument;

public class C8105_InefficientStringBuffering_StringBufferConstructorArgument_bad {

    public void badMethod(int param) {
        StringBuffer buffer = new StringBuffer("Line No" + param); // @violation
    }
}
