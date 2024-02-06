package com.example.galibtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1Text, num2Text;
    TextView OutputView;
    Double num1, num2, Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1Text=findViewById(R.id.WeightEditText);
        num2Text=findViewById(R.id.HightEditText);
        OutputView=findViewById(R.id.OutputTextView);
    }


    public void mathFunction(View view) {
        num1=Double.parseDouble(num1Text.getText().toString());
        num2=Double.parseDouble(num2Text.getText().toString());
        if (view.getId()== R.id.button){
            Result=(num1+num2);
        }
        else if (view.getId()== R.id.button1){
            Result=(num1-num2);
        }
        else if (view.getId()== R.id.button2){
            Result=(num1*num2);
        }
        else  (view.getId()== R.id.button3) {
            Result=(num1/num2);
        }

        String BMI = String.format("%.2f", Result);
        OutputView.setText( " Result = " + BMI);
    }


}