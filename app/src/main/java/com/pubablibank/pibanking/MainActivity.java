package com.pubablibank.pibanking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pubablibank.pibanking.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mVB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVB = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mVB.getRoot());
    }
}