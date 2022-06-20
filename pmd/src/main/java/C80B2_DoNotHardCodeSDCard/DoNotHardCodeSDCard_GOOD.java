package C80B2_DoNotHardCodeSDCard;
import android.os.Environment;
public class DoNotHardCodeSDCard_GOOD {
    public class MyActivity extends Activity {
        protected void foo() {
            String storageLocation = Environment.getExternalStorageDirectory() + "/mypackage";
        }
    }
    private class Activity {
    }
}
