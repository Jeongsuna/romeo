package C8092_AvoidBranchingStatementAsLa;

public class AvoidBranchingStatementAsLa_BAD {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i*i <= 25) {
                continue;
            }
            break;
        }
    }
}
