package C80D5_NonStaticInitializer;

public class NonStaticInitializer_BAD {
    public class MyClass {
        {
            System.out.println("I am about to construct myself");
        }
    }
}
