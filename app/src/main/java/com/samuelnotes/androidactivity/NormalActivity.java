package com.samuelnotes.androidactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

/**
 * desc:
 */
public class NormalActivity extends BaseActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        ImageView img_iv = findViewById(R.id.img_iv);
        img_iv.setOnClickListener(this);

        Button back_btn = findViewById(R.id.back_btn);
        back_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.img_iv:
                Toast.makeText(mContext,"Welcome to Android  world!",Toast.LENGTH_LONG).show();
                break;

            case R.id.back_btn:
                //  返回
                onBackPressed();
                break;

        }

    }



}
