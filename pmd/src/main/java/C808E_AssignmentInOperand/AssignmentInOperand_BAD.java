package C808E_AssignmentInOperand;

public class AssignmentInOperand_BAD {
    public class Test {
        public void foo() {
            int a = 1;
            if ((a = getA()) == 5) {
                System.out.println("5!");
            }
        }
        private int getA() {
            return 5;
        }
    }
}
