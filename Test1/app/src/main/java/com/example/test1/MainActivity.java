package com.example.test1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fullName, cls, point1, point2, point3;

    TextView txtFullName, txtPoint, txtXepLoai, txtClass, txtDiemTongKet;

    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        fullName = findViewById(R.id.textFullName);
        cls = findViewById(R.id.editTextClass);
        point1 = findViewById(R.id.editTextPoint1);
        point2 = findViewById(R.id.editTextPoint2);
        point3 = findViewById(R.id.editTextPoint3);

        btnCalc = findViewById(R.id.btnCalc);

        txtFullName = findViewById(R.id.textView8);
        txtClass = findViewById(R.id.textView9);
        txtDiemTongKet = findViewById(R.id.textView10);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float diemTongKet = (Float.parseFloat(point1.getText().toString()) + Float.parseFloat(point2.getText().toString()) + Float.parseFloat(point1.getText().toString())) / 3;
                txtFullName.setText(fullName.getText());
                txtClass.setText(cls.getText());
                String x = diemTongKet + "";
                txtDiemTongKet.setText(x);
            }
        });
    }

    private void addEvents() {

    }

    private void calcPoint() {
    }


    private void addControls() {

    }


}