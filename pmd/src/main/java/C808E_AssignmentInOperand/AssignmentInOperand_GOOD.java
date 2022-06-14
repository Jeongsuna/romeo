package C808E_AssignmentInOperand;

public class AssignmentInOperand_GOOD {
    public class Test {
        public void foo() {
            int a = 1;
            a = getA();
            if (a == 5) {
                System.out.println("5!");
            }
        }
        private int getA() {
            return 5;
        }
    }
}
