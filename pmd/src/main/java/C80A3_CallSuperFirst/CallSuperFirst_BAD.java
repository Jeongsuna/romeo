package C80A3_CallSuperFirst;

public class CallSuperFirst_BAD {
    public class DummyActivity extends Activity {
        public void onCreate(Bundle bundle) {
            foo();
        }
    }

    private void foo() {
    }

    private static class Activity {
    }

    private class Bundle {
    }
}
