package com.example.applicationimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
    }

    public void calcularIMC(View view){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = (peso)/(altura * altura);

        if(resultado <= 18.5){
            textResultado.setText("Você está ABAIXO DO PESO!");
        }
        else if(resultado <= 18.6 || resultado <= 24.9){
            textResultado.setText("Você está DENTRO DO PESO IDEAL!");
        }
        else if(resultado <= 25.0 || resultado <= 29.9){
            textResultado.setText("Você está LEVEMENTE ACIMA DO PESO!");
        }
        else if(resultado <= 30.0 || resultado <= 34.9){
            textResultado.setText("Você está EM OBESIDADE I!");
        }
        else if(resultado <= 35.0 || resultado <= 39.9){
            textResultado.setText("Você está EM OBESIDADE II!");
        }
        else if(resultado >= 40.0){
            textResultado.setText("Você está EM OBESIDADE III!");
        }
    }
}