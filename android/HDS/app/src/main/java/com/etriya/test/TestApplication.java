package com.etriya.test;

import android.app.Application;

public class TestApplication extends Application {

    public static int v19;

    @Override
    public void onCreate() {
        super.onCreate();

        // TEST19: 프레그먼트 흐름 추적 및 스택틱 변수 추적 (1/2)
        v19 = new Input().input1();
    }
}
