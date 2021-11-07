package com.poonammahi.midterm_calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText ETResult; //setting edittext globally
    float valueOne, valueTwo; //taking 2 float type variable
    boolean isAddition, isSubtract, isMultiplication, isDivision; //taking boolean variable for all operations

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare elements and finding using Id's
        Button bZero=findViewById(R.id.button0);
        Button bOne=findViewById(R.id.button1);
        Button bTwo=findViewById(R.id.button2);
        Button bThree=findViewById(R.id.button3);
        Button bFour=findViewById(R.id.button4);
        Button bFive=findViewById(R.id.button5);
        Button bSix=findViewById(R.id.button6);
        Button bSeven=findViewById(R.id.button7);
        Button bEight=findViewById(R.id.button8);
        Button bNine=findViewById(R.id.button9);
        Button bDecimal=findViewById(R.id.decimalButton);
        Button bClear=findViewById(R.id.clearButton);
        Button bAdd=findViewById(R.id.addButton);
        Button bSub=findViewById(R.id.subButton);
        Button bMul=findViewById(R.id.mulButton);
        Button bDiv=findViewById(R.id.divButton);
        Button bEqual=findViewById(R.id.equalButton);

        ETResult=findViewById(R.id.resultET);

        //setting all the elements
        bZero.setOnClickListener(this);
        bOne.setOnClickListener(this);
        bTwo.setOnClickListener(this);
        bThree.setOnClickListener(this);
        bFour.setOnClickListener(this);
        bFive.setOnClickListener(this);
        bSix.setOnClickListener(this);
        bSeven.setOnClickListener(this);
        bEight.setOnClickListener(this);
        bNine.setOnClickListener(this);
        bDecimal.setOnClickListener(this);
        bClear.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bEqual.setOnClickListener(this);


    }

    //onclick listener which define operation of each button
    @Override
    public void onClick(View view) {
        String enteredValue;
        switch(view.getId())
        {
            case R.id.button0:
                enteredValue=ETResult.getText() + "0";
                ETResult.setText(enteredValue);
                break;
            case R.id.button1:
                enteredValue=ETResult.getText() + "1";
                ETResult.setText(enteredValue);
                break;
            case R.id.button2:
                enteredValue=ETResult.getText() + "2";
                ETResult.setText(enteredValue);
                break;
            case R.id.button3:
                enteredValue=ETResult.getText() + "3";
                ETResult.setText(enteredValue);
                break;
            case R.id.button4:
                enteredValue=ETResult.getText() + "4";
                ETResult.setText(enteredValue);
                break;
            case R.id.button5:
                enteredValue=ETResult.getText() + "5";
                ETResult.setText(enteredValue);
                break;
            case R.id.button6:
                enteredValue=ETResult.getText() + "6";
                ETResult.setText(enteredValue);
                break;
            case R.id.button7:
                enteredValue=ETResult.getText() + "7";
                ETResult.setText(enteredValue);
                break;
            case R.id.button8:
                enteredValue=ETResult.getText() + "8";
                ETResult.setText(enteredValue);
                break;
            case R.id.button9:
                enteredValue=ETResult.getText() + "9";
                ETResult.setText(enteredValue);
                break;
            case R.id.decimalButton:
                enteredValue=ETResult.getText() + ".";
                ETResult.setText(enteredValue);
                break;
            case R.id.clearButton:
               ETResult.setText(""); 
                break;
            case R.id.addButton:
                if (ETResult == null) {
                    ETResult.setText("");
                } else {
                    valueOne = Float.parseFloat(ETResult.getText() + "");
                    isAddition = true;
                    ETResult.setText(null);
                }
                break;
            case R.id.subButton:
                valueOne = Float.parseFloat(ETResult.getText() + "");
                isSubtract = true;
                ETResult.setText(null);
                break;
            case R.id.mulButton:
                valueOne = Float.parseFloat(ETResult.getText() + "");
                isMultiplication = true;
                ETResult.setText(null);
                break;
            case R.id.divButton:
                valueOne = Float.parseFloat(ETResult.getText() + "");
                isDivision = true;
                ETResult.setText(null);
                break;
            case R.id.equalButton:
                valueTwo = Float.parseFloat(ETResult.getText() + "");

                if (isAddition == true) {
                    ETResult.setText(valueOne + valueTwo + "");
                    isAddition = false;
                }

                if (isSubtract == true) {
                    ETResult.setText(valueOne - valueTwo + "");
                    isSubtract = false;
                }

                if (isMultiplication == true) {
                    ETResult.setText(valueOne * valueTwo + "");
                    isMultiplication = false;
                }

                if (isDivision == true) {
                    ETResult.setText(valueOne / valueTwo + "");
                    isDivision = false;
                }
                break;
        }

    }
}