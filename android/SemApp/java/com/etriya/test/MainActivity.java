package com.etriya.test;

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
    
    @Override
    protected void onResume() {
		String src_Sink = new Sem().src();
        String oneToTwo_Sink = "";
		String oneToRet_Sink = "";
		
		new Sem().oneToTwo(src_Sink, oneToTwo_Sink);
		oneToRet_Sink = new Sem().oneToRet(src_Sink);
		
		new Sem().sink(src_Sink);
		
		new Sem().sink(oneToTwo_Sink);
		
		new Sem().sink(oneToRet_Sink);
     
    }

    
}