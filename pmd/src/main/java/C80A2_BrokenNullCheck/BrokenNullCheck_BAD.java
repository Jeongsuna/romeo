package C80A2_BrokenNullCheck;

public class BrokenNullCheck_BAD {
    public String bar(String string) {
        if (string!=null || !string.equals(""))
            return string;
        if (string==null && string.equals(""))
            return string;
        return string;
    }
}
