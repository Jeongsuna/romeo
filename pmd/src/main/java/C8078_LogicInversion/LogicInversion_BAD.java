package C8078_LogicInversion;

public class LogicInversion_BAD {
    public boolean bar(int a, int b) {
        if (!(a == b)) {
            return false;
        }
        if (!(a < b)) {
            return false;
        }
        return true;
    }
}
