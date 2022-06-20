package C80A4_CallSuperLast;

import C80A3_CallSuperFirst.CallSuperFirst_GOOD;

public class CallSuperLast_BAD {
    public class DummyActivity extends Activity {
        public void onPause(Bundle bundle) {
            foo();
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
