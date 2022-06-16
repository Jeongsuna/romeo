package C8050_PrematureDeclaration;

public class PrematureDeclaration_GOOD {
    public int getLength(String[] strings) {
        if (strings == null || strings.length == 0) return 0;
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        return length;
    }
}
