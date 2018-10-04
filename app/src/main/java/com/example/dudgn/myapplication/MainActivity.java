package com.example.dudgn.myapplication;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dudgn.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btn.setText("hello");
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new FirstFragment()).commit();
                //getSupportFragmentManager: 프래그먼트 관리, beginTransaction: 매니저가 어떤 작업할지.
                //add의 첫번째 인자는 갖다 붙힐 레이아웃, 두번째는 프래그먼트
            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container,new SecondFragment()).commit();
            }
        });
        binding.viewpager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));
    }
}
