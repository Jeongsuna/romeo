package C9014_IFELSESAME;

public class IFELSESAME_BAD {
    public static void main(String[] args) {
        int var = 1;
        int var2 = 2;
        String str = "str";
        if (var == 1 && str == "str")
            startProcess();
        else if (var == 1 || var2 == 2)
            stopProcess();
        else if (var==1&&str=="str")
            moveProcessToTheBackground();
    }

    private static void moveProcessToTheBackground() {
    }

    private static void stopProcess() {
    }

    private static void startProcess() {
    }
}
