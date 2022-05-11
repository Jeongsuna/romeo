package C9025_USEWRAPPERCLASS;

public class USEWRAPPERCLASS_BAD {
    Integer i = 123456789;
    Float f = 1.0f;
    Number n = i > f ? i : f;  // Noncompliant; i is coerced to float. n = 1.23456792E8
}
