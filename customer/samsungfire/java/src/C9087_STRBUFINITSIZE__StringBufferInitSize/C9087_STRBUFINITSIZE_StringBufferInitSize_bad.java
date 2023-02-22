package C9087_STRBUFINITSIZE__StringBufferInitSize;

public class C9087_STRBUFINITSIZE_StringBufferInitSize_bad {

    public void badMethod() {
        String variable1 = "";
        StringBuffer buffer = new StringBuffer(); // @violation : without argument
        buffer.append("SQL .... ");
        buffer.append(variable1);

    }
}
