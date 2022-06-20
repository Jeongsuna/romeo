package C80A3_CallSuperFirst;

public class CallSuperFirst_GOOD {
    public class DummyActivity extends Activity {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            foo();
        }
    }

    private void foo() {
    }

    private static class Activity {
        protected void onCreate(Bundle bundle) {
        }
    }

    private class Bundle {
    }
}
