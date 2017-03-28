package com.mobileappscompany.training.retrofit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = (TextView) findViewById(R.id.textView);

        RContr rC = new RContr();
        rC.setA(this);
        rC.start(3);

    }



    public void write2TV(String s){
        tV.setText(s);
    }
}
