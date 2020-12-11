package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);
        Button sumar = findViewById(R.id.button);
        Button restar = findViewById(R.id.button2);
        Button multi = findViewById(R.id.button3);
        Button divi = findViewById(R.id.button4);
        Button igual = findViewById(R.id.button5);
        TextView variable = findViewById(R.id.simbolo);
        TextView total = findViewById(R.id.resultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variable.setText(" +");
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variable.setText(" -");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variable.setText(" x");
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                variable.setText(" ÷");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float numero1 = Integer.parseInt(num1.getText().toString());
                float numero2 = Integer.parseInt(num2.getText().toString());
                if(variable.getText() == " +") {
                    float resultado = numero1 + numero2;
                    total.setText("" + resultado);
                }
                if(variable.getText() == " -") {
                    float resultado = numero1 - numero2;
                    total.setText("" + resultado);
                }
                if(variable.getText() == " x") {
                    float resultado = numero1 * numero2;
                    total.setText("" + resultado);
                }
                if(variable.getText() == " ÷") {
                    float resultado = numero1 / numero2;
                    total.setText("" + resultado);
                }
            }
        });
    }
}