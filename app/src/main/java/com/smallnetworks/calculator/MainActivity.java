package com.smallnetworks.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer total = 0;
    private Integer lastTotal = 0;
    private String inputString = "";
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
    private TextView txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTotal = (TextView) findViewById(R.id.txtTotal);
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

        txtTotal.setText("0");

        btnClearAll.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = 0;
                txtTotal.setText("0");
            }
        });

        btnClearLast.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = lastTotal;
                txtTotal.setText(total.toString());
            }
        });

        btnBackSpace.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputString.length() > 0)
                    inputString = inputString.substring(0, inputString.length() - 1);
                txtTotal.setText(inputString);
            }
        });

        btn0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "0";
                txtTotal.setText(inputString);
            }
        });

        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "1";
                txtTotal.setText(inputString);
            }
        });

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "2";
                txtTotal.setText(inputString);
            }
        });

        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "3";
                txtTotal.setText(inputString);
            }
        });

        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "4";
                txtTotal.setText(inputString);
            }
        });

        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "5";
                txtTotal.setText(inputString);
            }
        });

        btn6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "6";
                txtTotal.setText(inputString);
            }
        });

        btn7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "7";
                txtTotal.setText(inputString);
            }
        });

        btn8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "8";
                txtTotal.setText(inputString);
            }
        });

        btn9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += "9";
                txtTotal.setText(inputString);
            }
        });

        btnPoint.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString += ".";
                txtTotal.setText(inputString);
            }
        });

        btnMinusEqual.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tmp = Integer.parseInt(inputString);
                lastTotal = total;
                total -= tmp;
                txtTotal.setText(total.toString());
                inputString = "";
            }
        });

        btnPlusEqual.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tmp = Integer.parseInt(inputString);
                lastTotal = total;
                total += tmp;
                txtTotal.setText(total.toString());
                inputString = "";
            }
        });
    }
}
