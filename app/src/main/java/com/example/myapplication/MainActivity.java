package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText Celsius;                //宣告全域變數
    EditText Fahrenheit;                //宣告全域變數
    float fahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Celsius = findViewById(R.id.editTextTextPersonName);// 取得輸入物件
    }
    public void calculate (View view){
    try {
        if (!("".equals(Celsius.getText().toString()))) {

            TextView Fahrenheit = findViewById(R.id.textView);
            float CELSIUS = Float.parseFloat(Celsius.getEditableText().toString());
            fahrenheit = CELSIUS * (9 / 5) + 32;
            //TextView BMI = findViewById(R.id.textView);
            Fahrenheit.setText("" + fahrenheit);//Fahrenheit更改為計數器fahrenheit的資料
            //BMI更改為計數器msg的資料
            //BMI.setText(editText.getText().toString());BMI更改為editText的字串
            }
        }
    catch(Exception e){
        Toast.makeText(this,"PLEASE INPUT CORRECT NUMBER", Toast.LENGTH_SHORT).show();
         }
    }
}