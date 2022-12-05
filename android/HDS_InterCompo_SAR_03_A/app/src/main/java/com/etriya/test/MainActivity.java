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

    private static int v9_1, v9_2, v9_3, v9_4, v9_5, v9_6;
    private int v9;

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

                // INTENT_TEST12: 인텐트 (1/2)
                Intent v12_intent = new Intent();
                v12_intent.setClassName(MainActivity.this, "com.etriya.test.TestActivity1");
                v12_intent.putExtra("v12", Input.input2.get(new Integer(4)));
                startActivity(v12_intent);
            }
        });

        // LIFECYCLE_TEST9: 암시적 흐름 & 스태틱 변수 추적 & name 기술 (1/6)
        v9_1 = new Input().input1();

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (1/6)
        v11_1 = Input.input2.get(new Integer(11));

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
        new Output().output1( v9_6 );
        v9 = v9_6;
        new Output().output1( v9 );

        // LIFECYCLE_TEST11: 암시적 흐름 & 맴버 변수 추적 & name 기술 (6/6)
        v11_6 = v11_5;
        new Output().output1( Integer.parseInt(v11_6) );
        v11 = Integer.parseInt(v11_6.substring(5));
        new Output().output1( v11 );
    }

}