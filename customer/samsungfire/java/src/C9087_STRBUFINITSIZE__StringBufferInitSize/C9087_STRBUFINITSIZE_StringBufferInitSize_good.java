package C9087_STRBUFINITSIZE__StringBufferInitSize;

public class C9087_STRBUFINITSIZE_StringBufferInitSize_good {

    public void badMethod() {
        String variable1 = "";
        StringBuffer buffer = new StringBuffer(1024); // @fixed
        buffer.append("SQL .... ");
        buffer.append(variable1);

    }
}
