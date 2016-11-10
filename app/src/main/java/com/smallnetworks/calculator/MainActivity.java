package com.smallnetworks.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivison;
    private Button btnMultiplication;
    private Button btnClear;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPoint;
    private Button btnDouble0;
    private Button btnMinusEqual;
    private Button btnPlusEqual;
    private TextView textTotal;

    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivison = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);
        textResult = (TextView) findViewById(R.id.textResult);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnDouble0 = (Button) findViewById(R.id.btnDouble0);
        btnMinusEqual = (Button) findViewById(R.id.btnMinusEqual);
        btnPlusEqual = (Button) findViewById(R.id.btnPlusEqual);

        btnClear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                textResult.setText("0.00");
                operand1.requestFocus();
            }
        });

        btnAddition.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    textResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers.", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtraction.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 - oper2;
                textResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers.", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivison.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 / oper2;
                textResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers.", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                double oper1 = Double.parseDouble(operand1.getText().toString());
                double oper2 = Double.parseDouble(operand2.getText().toString());
                double theResult = oper1 * oper2;
                textResult.setText(Double.toString(theResult));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please enter two numbers.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
