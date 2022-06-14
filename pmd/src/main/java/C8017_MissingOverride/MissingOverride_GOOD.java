package C8017_MissingOverride;

public class MissingOverride_GOOD {
    public class Bar implements Runnable {
        @Override
        public void run() {
        }
    }
}
