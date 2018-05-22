package com.silmiazdkiatulathqia.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String data = "Hello Word";
    boolean isTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isTrue) {
            data = "Hallo dunia";
        }
    }
}
