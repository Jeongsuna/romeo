package C8019_PositionLiteralsFirstInCase;

public class PositionLiteralsFirstInCase_BAD {
    class Bar{
        boolean foo(String str) {
            return str.equalsIgnoreCase("5");
        }
    }
}
