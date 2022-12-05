package com.etriya.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.etriya.test.databinding.ActivityMainBinding;

public class TestActivity1 extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        String xxxxx = "yyyyyyy";
        // INTENT_TEST12: 인텐트 (2/2)
        Intent intent = getIntent();
        String v12 = intent.getStringExtra("v12");
        new Output().output1(Integer.parseInt(v12));
        new Output().output2(v12);
    }
}