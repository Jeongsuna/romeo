package com.etriya.test;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.etriya.test.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    private static int v3;
    private String v4;

    private static int v5;
    private String v6;

    private static int v7;
    private String v8;

    private static int v9_1, v9_2, v9_3, v9_4, v9_5, v9_6;
    private String v9;

    private static int v11;
    private String v11_1, v11_2, v11_3, v11_4, v11_5, v11_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();

                // FLOW_TEST7: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (2/2)
                new Output().output1(v7);

                // FLOW_TEST8: 암시적 흐름 & 맴버변수 추적 & name 미기술 (1/2)
                v8 = Input.input2.get(new Integer(8));

                // INTENT_TEST12: 인텐트 (1/2)
                Intent v12_intent = new Intent();
                v12_intent.setClassName(MainActivity.this, "com.etriya.test.TestActivity1");
                v12_intent.putExtra("v12", Input.input2.get(new Integer(4)));
                startActivity(v12_intent);

                // INTENT_TEST13: 인텐트 (1/2)
                Intent v13_intent = new Intent(MainActivity.this, TestActivity1.class);
                v13_intent.putExtra("v13", Input.input2.get(new Integer(4)));
                startActivity(v13_intent);

                // INTENT_TEST14: 인텐트 (1/2)
                Intent v14_intent = new Intent();
                v14_intent.setClassName(MainActivity.this, TestActivity1.class.getName());
                v14_intent.putExtra("v14", Input.input2.get(new Integer(4)));
                startActivity(v14_intent);
            }
        });

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (1/6)
        v9_1 = new Input().input1();

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (1/6)
        v11_1 = Input.input2.get(new Integer(11));

        // INTENT_TEST16: 인텐트 (1/2)
        Intent v16_intent = getIntent();
        int v16_1 = v16_intent.getIntExtra("v16_1", 1);
        String v16_2 = v16_intent.getStringExtra("v16_2");
        new Output().output1(v16_1);
        new Output().output2(v16_2);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (2/6)
        v9_2 = v9_1;

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (2/6)
        v11_2 = v11_1;
    }

    @Override
    protected void onResume() {
        super.onResume();

        // TEST1: 인트라 & 지역변수 추적 (name 기술)
        int v1 = new Input().input1();
        new Output().output1(v1);

        // TEST2: 인트라 & 지역변수 추적 (name 미기술)
        String v2 = Input.input2.get(new Integer(4));
        new Output().output2(v2);

        // TODO: TEST2-1: 인트라 & 지역변수 추적 (부모 타입, name 기술)

        // TODO: TEST2-2: 인트라 & 지역변수 추적 (부모 타입, name 미기술)

        // TEST3: 인트라 & 맴버변수 추적 (name 기술)
        v3 = new Input().input1();
        new Output().output1(v3);

        // TEST4: 인트라 & 맴버변수 추적 (name 미기술)
        v4 = Input.input2.get(new Integer(4));
        new Output().output2(v4);

        // TODO: TEST3-1: 인트라 & 맴버변수 추적 (부모 타입, name 기술)

        // TODO: TEST3-2: 인트라 & 맴버변수 추적 (부모 타입, name 미기술)

        // TEST5: 인트라 & 스태틱 변수 추적 (name 기술)
        v5 = new Input().input1();
        new Output().output1(v5);

        // TEST6: 인트라 & 스태틱 변수 추적 (name 미기술)
        v6 = Input.input2.get(new Integer(6));
        new Output().output2(v6);

        // TODO: TEST5-1: 인트라 & 스태틱 변수 추적 (부모 타입, name 기술)

        // TODO: TEST5-2: 인트라 & 스태틱 변수 추적 (부모 타입, name 미기술)

        // FLOW_TEST7: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (1/2)
        v7 = new Input().input1();

        // FLOW_TEST8: 암시적 흐름 & 맴버변수 추적 & name 미기술 (1/2)
        new Output().output2(v8);

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (3/6)
        v9_3 = v9_2;

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (3/6)
        v11_3 = v11_2;
    }

    @Override
    protected void onStop() {
        super.onStop();

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (4/6)
        v9_4 = v9_3;

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (4/6)
        v11_4 = v11_3;
    }

    @Override
    protected void onPause() {
        super.onPause();

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (5/6)
        v9_5 = v9_4;
        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (5/6)
        v11_5 = v11_4;


        // INTENT_TEST15: 인텐트 (1/2)
        IntentFilter filter = new IntentFilter();
        filter.addAction("ACTION_TEST15");
        registerReceiver(new TestBroadcast(), filter);

        Intent intent = new Intent("ACTION_TEST15");
        intent.putExtra("v15_1", new Input().input1());
        intent.putExtra("v15_2", Input.input2.get(new Integer(15)));
        sendBroadcast(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (6/6)
        v9_6 = v9_5;
        new Output().output1( v9_6 + "asdf" );
        v9 = v9_6 + "asdf";
        new Output().output1( v9 );

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (6/6)
        v11_6 = v11_5;
        new Output().output1( Integer.parseInt(v11_6) );
        v11 = Integer.parseInt(v11_6.substring(5));
        new Output().output1( v11 );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}