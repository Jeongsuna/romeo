package C8105_InefficientStringBuffering;

public class InefficientStringBuffering_BAD {
    StringBuffer sbuf = new StringBuffer( "temp =" + System.getProperty("java.io.tempdir") );
}
