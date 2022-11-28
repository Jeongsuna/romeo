package com.etriya.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class TestService extends Service {

    public static Intent receiveIntent;

    private static int v18_1, v18_2, v18_3;
    private String v18;

    @Override
    public void onCreate() {
        super.onCreate();

        // LIFECYCLE_TEST18: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (1/3)
        v18_1 = new Input().input1();

        // TEST19: 명시적 흐름 & 파라미터 추적 & name 기술
        int v19 = test_v19(new Input().input1());
        // TEST19-3: 3차 검출
        new Output().output2(String.format("asdf %d", v19));
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // INTENT_TEST17-1: 인텐트 (2/2)
        receiveIntent = intent;
        int v17_1 = receiveIntent.getIntExtra("v17_1", 1);
        String v17_2 = receiveIntent.getStringExtra("v17_2");
        new Output().output1(v17_1);
        new Output().output2(v17_2);

        // LIFECYCLE_TEST18: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (2/3)
        v18_2 = v18_1;

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // INTENT_TEST17-2: 인텐트 (2/2)
        int v17_1 = receiveIntent.getIntExtra("v17_1", 1);
        String v17_2 = receiveIntent.getStringExtra("v17_2");
        new Output().output1(v17_1);
        new Output().output2(v17_2);

        // LIFECYCLE_TEST18: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (3/3)
        v18_3 = v18_2;
        v18 = v18_3 + "asdf";
        new Output().output1(v18_3);
        new Output().output2(v18);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int test_v19(int v) {
        int temp = (v + 4) * 2;

        // TEST19-1: 1차 검출
        new Output().output1(v);

        String r = test_v19_2(temp);

        return Integer.parseInt(r);
    }

    public String test_v19_2(int v) {
        String tainted = Input.input2.get(v);

        // TEST19-2: 2차 검출
        new Output().output2(tainted);

        return tainted.split("/")[0];
    }
}
