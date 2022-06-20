package C80B2_DoNotHardCodeSDCard;

public class DoNotHardCodeSDCard_BAD {
    public class MyActivity extends Activity {
        protected void foo() {
            String storageLocation = "/sdcard/mypackage";
        }
    }

    private class Activity {
    }
}
