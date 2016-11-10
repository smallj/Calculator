package com.smallnetworks.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int total;
    private int lastNumber;
    private Button btnClearAll;
    private Button btnClearLast;
    private Button btnBackSpace;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTotal = (TextView) findViewById(R.id.textResult);
        btnClearAll = (Button) findViewById(R.id.btnClearAll);
        btnClearLast = (Button) findViewById(R.id.btnClearLast);
        btnBackSpace = (Button) findViewById(R.id.btnBackSpace);
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

        btnClearAll.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTotal.setText("0.00");
            }
        });

        btnClearLast.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textTotal.setText("0.00");
            }
        });
    }
}
