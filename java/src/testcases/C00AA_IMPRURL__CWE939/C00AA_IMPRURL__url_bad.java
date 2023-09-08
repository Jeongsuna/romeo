package testcases.C00AA_IMPRURL__CWE939;

import android.app.Activity;

import android.app.ActionBar;

import android.app.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.Menu;

import android.view.MenuItem;

import android.view.View;

import android.view.View.OnClickListener;

import android.view.ViewGroup;

import android.webkit.WebSettings;

import android.webkit.WebView;

import android.webkit.WebViewClient;

import android.os.Build;


public class C00AA_IMPRURL__url_bad extends WebViewClient{

    // Android
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        if (url.substring(0,14).equalsIgnoreCase("examplescheme:")){
            if(url.substring(14,25).equalsIgnoreCase("getUserInfo")){
                // 신뢰 하지 않은 url을 WebView가 실행
                writeDataToView(view, UserData);
                return false;
            }
            else{
                return true;
            }
        }
        return false;
    }

}
