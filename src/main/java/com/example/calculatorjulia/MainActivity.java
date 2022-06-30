package com.example.calculatorjulia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    boolean isNewOp = true;
    String oldNum = "";
    String op = "";
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.editTextNumber);
    }

    public void numberEvent(View view) {
        if (isNewOp)
            edt.setText("");
        isNewOp = false;
        String num = edt.getText().toString();
        switch (view.getId()){
            case R.id.bu0:
                num += "0";
                break;
            case R.id.bu1:
                num += "1";
                break;
            case R.id.bu2:
                num += "2";
                break;
            case R.id.bu3:
                num += "3";
                break;
            case R.id.bu4:
                num += "4";
                break;
            case R.id.bu5:
                num += "5";
                break;
            case R.id.bu6:
                num += "6";
                break;
            case R.id.bu7:
                num += "7";
                break;
            case R.id.bu8:
                num += "8";
                break;
            case R.id.bu9:
                num += "9";
                break;
            case R.id.buDot:
                num += ".";
                break;
        }
        edt.setText(num);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNum = edt.getText().toString();

        switch (view.getId()){
            case R.id.buPlus:
                op = "+";
                break;
            case R.id.buMinus:
                op = "-";
                break;
            case R.id.buMultiply:
                op = "*";
                break;
            case R.id.buDivide:
                op = "/";
                break;
        }
    }
    //hi Its C.G.D. Julia Yossa's MAM416 assignment
    public void equateEvent(View view) {
        String newNum = edt.getText().toString();
        double result = 0.0;

        switch (op){
            case "+":
                result = Double.parseDouble(oldNum) + Double.parseDouble(newNum);
                break;
            case "-":
                result = Double.parseDouble(oldNum) - Double.parseDouble(newNum);
                break;
            case "*":
                result = Double.parseDouble(oldNum) * Double.parseDouble(newNum);
                break;
            case "/":
                result = Double.parseDouble(oldNum) / Double.parseDouble(newNum);
                break;

        }
        edt.setText(result+"");
    }

    public void clearEvent(View view) {
        edt.setText("0");
        isNewOp = true;
    }
}