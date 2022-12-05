package com.etriya.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TestBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        // INTENT_TEST15: 인텐트 (2/2)
        int v15_1 = intent.getIntExtra("v15_1", 1);
        String v15_2 = intent.getStringExtra("v15_2");
        new Output().output1(v15_1);
        new Output().output2(v15_2);

        // INTENT_TEST17: 인텐트 (1/2)
        Intent v17_intent = new Intent(context.getApplicationContext(), TestService.class);
        v17_intent.putExtra("v17_1", new Input().input1());
        v17_intent.putExtra("v17_2", Input.input2.get(new Integer(17)));
        context.startService(v17_intent);
        context.startForegroundService(v17_intent);
    }
}
