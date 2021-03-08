package com.example.comparativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculo(View view) {

        TextView resultado = findViewById(R.id.textResultado);

        TextInputEditText precoAlcool;
        precoAlcool = this.<TextInputEditText>findViewById(R.id.editPrecoAlcool);

        TextInputEditText precoGasolina;
        precoGasolina = this.<TextInputEditText>findViewById(R.id.editPrecoGasolina);

        String precoA = getText(precoAlcool);
        String precoG = getText(precoGasolina);

        Double valorA = Double.parseDouble(precoA);
        Double valorG = Double.parseDouble(precoG);

        if(valorA < valorG)
        {
            resultado.setText("O melhor é o Álcool");
        }
        if(valorG < valorA)
        {
            resultado.setText("O melhor é a Gasolina");
        }

    }

    private String getText(TextInputEditText precoAlcool) {
        return null;
    }
}