package com.gorginroid.sdfgh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.gorginroid.sdfgh.util.C2;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);

        method();
    }

    private void method() {
        C2 jC2=new C2();
        TextView jTexView =(TextView) findViewById(R.id.textView1);

        jTexView.setText(jC2.m1());
    }


}
