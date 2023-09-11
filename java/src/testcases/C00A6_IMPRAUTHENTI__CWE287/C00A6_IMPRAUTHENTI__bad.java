import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

import java.util.concurrent.Executor;

public class BadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Executor executor = ContextCompat.getMainExecutor(this);
        BiometricPrompt biometricPrompt = new BiometricPrompt(this, executor, callback);
        
        BiometricPrompt.PromptInfo promptInfo = new BiometricPrompt.PromptInfo.Builder()
                .setTitle("제목")
                .setSubtitle("부제목")
                .setDescription("설명")
                .setNegativeButtonText("취소")
                .build();

        // Noncompliant - 암호화 없이 인증
        biometricPrompt.authenticate(promptInfo);
    }

    private final BiometricPrompt.AuthenticationCallback callback =
            new BiometricPrompt.AuthenticationCallback() {
                @Override
                public void onAuthenticationError(int errorCode, CharSequence errString) {
                    super.onAuthenticationError(errorCode, errString);
                    // 에러 처리 코드를 여기에 작성하세요.
                }

                @Override
                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
                    super.onAuthenticationSucceeded(result);
                    // 성공 처리 코드를 여기에 작성하세요.
                }

                 @Override
                 public void onAuthenticationFailed() {
                     super.onAuthenticationFailed();
                     // 실패 처리 코드를 여기에 작성하세요.
                 }
            };
}
