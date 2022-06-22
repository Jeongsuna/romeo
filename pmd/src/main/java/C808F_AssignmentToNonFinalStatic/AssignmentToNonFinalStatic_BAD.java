package C808F_AssignmentToNonFinalStatic;

public class AssignmentToNonFinalStatic_BAD {
    public static class StaticField {
        static String x = "a";
        public StaticField() {
            x = "a";
        }
    }
}
