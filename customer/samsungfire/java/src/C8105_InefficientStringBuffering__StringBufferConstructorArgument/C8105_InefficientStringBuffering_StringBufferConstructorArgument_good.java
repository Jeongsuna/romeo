package C8105_InefficientStringBuffering__StringBufferConstructorArgument;

public class C8105_InefficientStringBuffering_StringBufferConstructorArgument_good {

    public void goodMethod(int param) {
        StringBuffer buffer = new StringBuffer("Line No");
        buffer.append(param);
    }
}
