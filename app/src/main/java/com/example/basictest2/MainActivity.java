package com.example.basictest2;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView display;
    EditText disp;
    Button btn;
    String str,st;
    EditText dip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.fatextview);
        btn = findViewById(R.id.fabutton);
        disp = findViewById(R.id.faeditText);
        dip= findViewById(R.id.faaeditText2);
        //str = disp.getText().toString();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //display.setText(disp.getText().toString());
                    Intent i = new Intent(MainActivity.this, secondActivity.class);
                    str = disp.getText().toString();
                    st = dip.getText().toString();
                    i.putExtra("value", str);
                    //i.putExtra("value",st);
                    System.out.println(str.toString());
                    startActivity(i);
                    finish();
            }

        });
    }
}
