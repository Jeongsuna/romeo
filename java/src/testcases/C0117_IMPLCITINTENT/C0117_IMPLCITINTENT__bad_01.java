package testcases.C0117_IMPLCITINTENT;

import android.content.Intent;

public class C0117_IMPLCITINTENT__bad_01 {
    public static final String ACTION_CREATE_USER = "com.example.CreateUser";

    public static void main(String[] args) {
        String un = "username";
        String pw = "password";

        // 인텐트 생성
        Intent intent = new Intent();
        intent.setAction(ACTION_CREATE_USER);
        intent.putExtra("Username", un);
        intent.putExtra("Password", pw);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

        // 브로드캐스트 전송
        sendBroadcast(intent);
    }

    public static void sendBroadcast(Intent intent) {
        System.out.println("Extra - Password: " + intent.getStringExtra("Password"));
    }
}