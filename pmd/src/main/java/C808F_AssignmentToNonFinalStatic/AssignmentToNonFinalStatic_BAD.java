package C808F_AssignmentToNonFinalStatic;

public class AssignmentToNonFinalStatic_BAD {
    public static class StaticField {
        static int x;
        public void FinalFields(int y) {
            x = y;
        }
    }
}
