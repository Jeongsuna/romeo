package C809A_AvoidFieldNameMatchingTypeN;

public class AvoidFieldNameMatchingTypeName_BAD {
    public class Foo extends Bar {
        int foo;
    }
    public interface Operation {
        int OPERATION = 1;
    }
    private class Bar {
    }
}
