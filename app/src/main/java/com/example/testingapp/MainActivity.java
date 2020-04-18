package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1Text);
        num2 = (EditText)findViewById(R.id.num2Text);
        result = (TextView)findViewById(R.id.resultText);
        name =  (EditText)findViewById(R.id.editText2);
    }

    public void Sumar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int x = Integer.parseInt(valor1);
        int y = Integer.parseInt(valor2);

        int z = x + y;
        String finalvalue = String.valueOf(z);
        result.setText(finalvalue);
    }

    public void Restar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();

        int x = Integer.parseInt(valor1);
        int y = Integer.parseInt(valor2);

        int z = x - y;
        String finalvalue = String.valueOf(z);
        result.setText(finalvalue);
    }

    public void Next(View view){
        Intent next = new Intent(this , SegundaAct.class);
        next.putExtra("dato", name.getText().toString());
        startActivity(next);

    }



}
