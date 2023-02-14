package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_inicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inicar =findViewById(R.id.btn);

        btn_inicar.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {

        if (view == btn_inicar) {
            Intent intent = new Intent(MainActivity.this, SampleCamActivity.class);

            startActivity(intent);

        }

    }
}