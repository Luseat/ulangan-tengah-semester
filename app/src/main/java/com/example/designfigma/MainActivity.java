package com.example.designfigma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SignalStrengthUpdateRequest;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(MainActivity.this,Login.class);
        startActivity(intent);
    }

    public void ganti2(View view) {
        Intent intent = new Intent(MainActivity.this,Daftar.class);
        startActivity(intent);
    }
}