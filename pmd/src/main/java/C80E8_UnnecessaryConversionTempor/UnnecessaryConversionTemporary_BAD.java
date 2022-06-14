package C80E8_UnnecessaryConversionTempor;

public class UnnecessaryConversionTemporary_BAD {
    public String convert(int a) {
        String data = new Integer(a).toString();
        return data;
    }
}
