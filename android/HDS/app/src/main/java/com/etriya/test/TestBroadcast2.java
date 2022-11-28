package com.etriya.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TestBroadcast2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // INTENT_TEST16: 인텐트 (1/2)
        Intent v16_intent = new Intent(context.getApplicationContext(), MainActivity.class);
        v16_intent.putExtra("v16_1", new Input().input1());
        v16_intent.putExtra("v16_2", Input.input2.get(new Integer(16)));
        context.startActivity(v16_intent);
    }
}
