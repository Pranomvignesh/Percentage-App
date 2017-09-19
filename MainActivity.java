package com.pranomvignesh.percentageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText percentage;
    EditText number;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    result= (TextView) findViewById(R.id.Result);
        percentage=(EditText)findViewById(R.id.percentage);
        number=(EditText)findViewById(R.id.number);
        calculate=(Button)findViewById(R.id.calcbtn);
        calculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
               float percentagetxt=Float.parseFloat(percentage.getText().toString());
                float decimal=percentagetxt/100;
                float resulttxt=decimal * Float.parseFloat(number.getText().toString());
                result.setText(Float.toString(resulttxt));
            }
        });


    }
}
