package C809A_AvoidFieldNameMatchingTypeN;

public class AvoidFieldNameMatchingTypeName_GOOD {
    public class Foo extends Bar {
        int foovar;
    }
    public interface Operation {
        int OPERATIONVAR = 1;
    }
    private class Bar {
    }
}
