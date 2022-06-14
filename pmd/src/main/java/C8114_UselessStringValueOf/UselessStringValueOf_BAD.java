package C8114_UselessStringValueOf;

public class UselessStringValueOf_BAD {
    public String Foo(int i) {
        String str;
        str = "a" + String.valueOf(i);
        return str;
    }
}
