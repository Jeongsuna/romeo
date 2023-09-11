import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyProperties;

import java.security.KeyStore;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import java.util.concurrent.Executor;

public class GoodActivity extends AppCompatActivity {

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

        // 암호화 객체 생성
        Cipher cipher = createCipher();

        // Compliant - 암호화를 사용한 인증
        biometricPrompt.authenticate(promptInfo, new BiometricPrompt.CryptoObject(cipher));
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

    private Cipher createCipher() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);

            String keyName = "sampleKeyName";
            Key key = keyStore.getKey(keyName, null);

            Cipher cipher = Cipher.getInstance(KeyProperties.KEY_ALGORITHM_AES + "/"
                    + KeyProperties.BLOCK_MODE_CBC + "/"
                    + KeyProperties.ENCRYPTION_PADDING_PKCS7);
            cipher.init(Cipher.ENCRYPT_MODE, key);

            return cipher;
        } catch (Exception e) {
            throw new RuntimeException("Cipher creation failed", e);
        }
    }
}
