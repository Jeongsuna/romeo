package C8050_PrematureDeclaration;

public class PrematureDeclaration_BAD {
    public int getLength(String[] strings) {
        int length = 0;
        if (strings == null || strings.length == 0) return 0;
        for (String str : strings) {
            length += str.length();
        }
        return length;
    }
}
