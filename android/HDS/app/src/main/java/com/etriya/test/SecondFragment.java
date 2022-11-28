package com.etriya.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.etriya.test.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    private static int v19;

    public static int v20_1, v20_2, v20_3, v20_4, v20_5;
    public String v20;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // TEST19-1: 프레그먼트 흐름 추적 및 스택틱 변수 추적 (2/2)
        v19 = TestApplication.v19;
        new Output().output1(v19);

        // 주의: 흐름을 추적하기 위해 만든 샘플일뿐 실제 동작하는 코드는 아님
        ListView view = new ListView();
        view.setAdapter(new TestAdapter());

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this).navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

        // TEST19-2: 프레그먼트 흐름 추적 및 스택틱 변수 추적 (2/2)
        v19 = TestApplication.v19;
        new Output().output1(v19);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;

        // TEST19-3: 프레그먼트 흐름 추적 및 스택틱 변수 추적 (2/2)
        v19 = TestApplication.v19;
        new Output().output1(v19);
    }

    @Override
    public void onStart() {
        super.onStart();

        // LIFECYCLE_TEST20: 암시적 호출 & 스택틱 변수 추적 & name 기능 (1/5)
        v20_1 = new Input().input1();
    }

    @Override
    public void onResume() {
        super.onResume();

        // LIFECYCLE_TEST20: 암시적 호출 & 스택틱 변수 추적 & name 기능 (2/5)
        v20_2 = v20_1;
    }

    @Override
    public void onStop() {
        super.onStop();

        // LIFECYCLE_TEST20: 암시적 호출 & 스택틱 변수 추적 & name 기능 (3/5)
        v20_3 = v20_2;
    }

    @Override
    public void onPause() {
        super.onPause();

        // LIFECYCLE_TEST20: 암시적 호출 & 스택틱 변수 추적 & name 기능 (4/5)
        v20_4 = v20_3;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        // LIFECYCLE_TEST20: 암시적 호출 & 스택틱 변수 추적 & name 기능 (5/5)
        v20_5 = v20_4;
        v20 = v20_5 + "1234";

        new Output().output1(v20_5);
        new Output().output2(v20);

    }
}