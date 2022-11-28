package com.etriya.test;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TestAdapter extends BaseAdapter {

    private static int v19;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // TEST19-4: 프레그먼트 흐름 추적 및 스택틱 변수 추적 (2/2)
        v19 = TestApplication.v19;
        new Output().output1(v19);

        return convertView;
    }
}
