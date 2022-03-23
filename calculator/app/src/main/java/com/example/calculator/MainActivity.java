package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAC, btnMinus,
            btnPercent, btnDiv, btnMultiplication, btnSubtraction, btnAddition, btnEqual, btnDot;

    private TextView mainScreen, secondScreen;
    String tinhToan, phepToan;

    boolean checkDot = false, checkEqual = false, checkMinus = false;
    double number1, number2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainScreen.setText("");
                secondScreen.setText("");
                tinhToan = "";
                phepToan = "";
                checkDot = false;
                checkEqual = false;
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "9");
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    if (!checkDot) {
                        tinhToan = mainScreen.getText().toString();
                        mainScreen.setText(tinhToan + ".");
                        checkDot = true;
                    }
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (!checkEqual) {
                    checkDot = false;
                    tinhToan = mainScreen.getText().toString();
                    number2 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(secondScreen.getText().toString() + mainScreen.getText().toString() + "");
                    mainScreen.setText("");
                    if (phepToan.equals("+")) {
                        result = number1 + number2;
                    } else if (phepToan.equals("-")) {
                        result = number1 - number2;
                    } else if (phepToan.equals("*")) {
                        result = number1 * number2;
                    } else if (phepToan.equals("/")) {
                        result = number1 / number2;
                    }
                    checkEqual = true;
                    mainScreen.setText(result + "");
                }
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (mainScreen.getText() == "") {
                    number1 = 0;
                    secondScreen.setText(" 0 + ");
                } else {
                    number1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " + ");
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "+";
                    checkDot = false;
                    checkEqual = false;
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (mainScreen.getText() == "") {
                    number1 = 0;
                    secondScreen.setText(" 0 - ");
                } else {
                    number1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " - ");
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "-";
                    checkDot = false;
                    checkEqual = false;
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (mainScreen.getText() == "") {
                    number1 = 0;
                    secondScreen.setText(" 0 * ");
                } else {
                    number1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " * ");
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "*";
                    checkDot = false;
                    checkEqual = false;
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (mainScreen.getText() == "") {
                    number1 = 0;
                    secondScreen.setText(" 0 / ");
                } else {
                    number1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " / ");
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "/";
                    checkDot = false;
                    checkEqual = false;
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkMinus) {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText("-" + tinhToan);
                    checkMinus = true;
                } else {
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan.substring(1, tinhToan.length()));
                    checkMinus = false;
                }
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(mainScreen.getText() + "");
                secondScreen.setText(mainScreen.getText().toString() + " + ");
                double rs = a / 100.0;
                mainScreen.setText(rs + "");
                checkDot = false;
                checkEqual = true;
            }
        });

    }

    private void addControls() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAC = findViewById(R.id.btnAC);
        btnMinus = findViewById(R.id.btnMinus);
        btnPercent = findViewById(R.id.btnPercent);
        btnDiv = findViewById(R.id.btnDiv);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnAddition = findViewById(R.id.btnAddition);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);

        mainScreen = findViewById(R.id.mainScreen);
        secondScreen = findViewById(R.id.secondScreen);
    }
}