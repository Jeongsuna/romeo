package C9025_USEWRAPPERCLASS;

public class USEWRAPPERCLASS_GOOD {
    Integer i = 123456789;
    Float f = 1.0f;
    Number n = i > f ? (Number) i : f;  // n = 123456789
}
