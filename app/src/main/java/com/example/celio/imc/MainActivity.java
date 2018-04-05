package com.example.celio.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void calculateIMC(View view) {
        String message = "";
        EditText weight = (EditText) findViewById(R.id.txtWeight);
        EditText height = (EditText) findViewById(R.id.txtHeight);
        TextView showResult = (TextView) findViewById(R.id.txtResult);
        float realWeight = Float.valueOf(weight.getText().toString());
        float realHeight = Float.valueOf(height.getText().toString());

        double result = realWeight / (Math.pow(realHeight,2));

        if (result <= 16.9)
            message = "Well below ideal weight";
        else if (result >= 17 && result <= 18.4)
            message = "Bellow ideal weight";
        else if (result > 18.4 && result <= 24.9)
            message = "Ideal weight";
        else if (result >= 25 && result <= 29.9)
            message = "Above ideal weight";
        else if (result >= 30 && result <= 34.9)
            message = "Stage 1 obesity";
        else if (result >= 35 && result <= 40)
            message = "Stage 2 obesity";
        else
            message = "Stage 3 obesity";

        showResult.setText(message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
