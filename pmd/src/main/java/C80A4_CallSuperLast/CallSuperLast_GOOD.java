package C80A4_CallSuperLast;

public class CallSuperLast_GOOD {
    public class DummyActivity extends Activity {
        public void onPause(Bundle bundle) {
            foo();
            super.onPause(bundle);
        }
    }
    private void foo() {
    }

    private static class Activity {
        protected void onPause(Bundle bundle) {
        }
    }
    private class Bundle {
    }
}
