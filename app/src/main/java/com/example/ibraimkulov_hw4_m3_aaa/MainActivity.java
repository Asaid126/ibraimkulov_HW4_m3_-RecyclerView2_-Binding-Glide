package com.example.ibraimkulov_hw4_m3_aaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ibraimkulov_hw4_m3_aaa.continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}