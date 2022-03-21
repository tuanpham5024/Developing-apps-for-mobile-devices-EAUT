package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner heightSpinner, weightSpinner;
    private EditText editTextHeight, editTextWeight, editTextAge;
    private Button btnCalcBMI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightSpinner = findViewById(R.id.heightSpinner);
        weightSpinner = findViewById(R.id.weightSpinner);
        editTextHeight = findViewById(R.id.editTextHeight);
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextAge = findViewById(R.id.editTextAge);
        btnCalcBMI = findViewById(R.id.btnCalcBMI);

        String[] heights = getResources().getStringArray(R.array.height);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, heights);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heightSpinner.setAdapter(adapter);


        String[] weights = getResources().getStringArray(R.array.weight);
        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, weights);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weightSpinner.setAdapter(adapter1);


        btnCalcBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double height = Double.parseDouble(editTextHeight.getText().toString());
                    double weight = Double.parseDouble(editTextWeight.getText().toString());
                    int age = Integer.parseInt(editTextAge.getText().toString());
                    double bmi;

                    bmi = weight / (height * height);

                    if (bmi > 40) {
                        Toast.makeText(MainActivity.this, "Bạn " + age + " tuổi thuộc nhóm béo phì cấp độ 3  và có nguye cơ phát triển bệnh nguy hiểm", Toast.LENGTH_LONG).show();
                    } else if (bmi > 35) {
                        Toast.makeText(MainActivity.this, "Bạn " + age + "  thuộc nhóm béo phì cấp độ 2  và có nguy cơ phát triển bệnh rất cao", Toast.LENGTH_LONG).show();

                    } else if (bmi > 30) {
                        Toast.makeText(MainActivity.this, "Bạn " + age + "  thuộc nhóm béo phì cấp độ 1 và có nguy cơ phát triển bệnh cao", Toast.LENGTH_LONG).show();

                    } else if (bmi > 25) {
                        Toast.makeText(MainActivity.this, "Bạn " + age + "  thuộc nhóm hơi béo và có nguy cơ phát triển bệnh cao", Toast.LENGTH_LONG).show();

                    } else if (bmi > 18.5) {
                        Toast.makeText(MainActivity.this, "Bạn " + age + "  thuộc nhóm bình thường và có nguy cơ phát triển bệnh trung bình", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(MainActivity.this, "Bạn " + age + "  thuộc nhóm gầy và có nguy cơ phát triển bệnh thấp", Toast.LENGTH_LONG).show();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


    }
}