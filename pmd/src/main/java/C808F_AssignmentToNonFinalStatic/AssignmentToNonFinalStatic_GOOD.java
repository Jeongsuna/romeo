package C808F_AssignmentToNonFinalStatic;

public class AssignmentToNonFinalStatic_GOOD {
    public static class StaticField {
        static int x;
        public void FinalFields(int y) {
            int temp = x;
            x = y;
        }
    }
}
