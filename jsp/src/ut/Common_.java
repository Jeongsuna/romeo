package ut;

/**
 * 메리츠 화재 오탐 예제 샘플
 */
public class Common_ {
    public static String escapeXml(String uri) {
        uri = uri.replaceAll("&", "_");
        uri = uri.replaceAll("#", "_");
        uri = uri.replaceAll("\"", "_");

        return uri;
    }

    public static String fakeEscapeXml(String uri) {
        return uri;
    }
}