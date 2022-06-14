package C8105_InefficientStringBuffering;
import java.lang.*;
public class InefficientStringBuffering_GOOD {
    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer("temp = ");
        sbuf.append(System.getProperty("java.io.tempdir"));
    }
}
