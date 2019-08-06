package com.example.basictest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView disp;
    String gtr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        disp=findViewById(R.id.scTextView);
        gtr=getIntent().getExtras().getString("value");
        System.out.println(gtr);
        disp.setText(gtr);
    }
}
