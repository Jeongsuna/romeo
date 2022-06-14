package C80BC_EmptyStatementNotInLoop;

public class EmptyStatementNotInLoop_BAD {
    public class Foo {
        public void testMethod() {
            ;
            System.out.println("extra semicolon");;
        }
    }
}
