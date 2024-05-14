package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {
    private EditText resultEditText;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultEditText = (EditText) findViewById(R.id.resultEditText);

        findViewById(R.id.botonAC).setOnClickListener(view -> limpiarPantalla());

        findViewById(R.id.boton0).setOnClickListener(view -> asignarTexto("0"));
        findViewById(R.id.boton1).setOnClickListener(view -> asignarTexto("1"));
        findViewById(R.id.boton2).setOnClickListener(view -> asignarTexto("2"));
        findViewById(R.id.boton3).setOnClickListener(view -> asignarTexto("3"));
        findViewById(R.id.boton4).setOnClickListener(view -> asignarTexto("4"));
        findViewById(R.id.boton5).setOnClickListener(view -> asignarTexto("5"));
        findViewById(R.id.boton6).setOnClickListener(view -> asignarTexto("6"));
        findViewById(R.id.boton7).setOnClickListener(view -> asignarTexto("7"));
        findViewById(R.id.boton8).setOnClickListener(view -> asignarTexto("8"));
        findViewById(R.id.boton9).setOnClickListener(view -> asignarTexto("9"));

        findViewById(R.id.botonPunto).setOnClickListener(view -> asignarTexto("."));
        findViewById(R.id.botonD).setOnClickListener(view -> eliminarUltimoCaracter());
        findViewById(R.id.botonIgual).setOnClickListener(view -> evaluar(resultEditText.getText().toString()));
        findViewById(R.id.botonSuma).setOnClickListener(view -> asignarTexto("+"));
        findViewById(R.id.botonResta).setOnClickListener(view -> asignarTexto("-"));
        findViewById(R.id.botonMultiplicacion).setOnClickListener(view -> asignarTexto("*"));
        findViewById(R.id.botonDivision).setOnClickListener(view -> asignarTexto("/"));
        findViewById(R.id.botonPorcentaje).setOnClickListener(view -> asignarTexto("%"));
        findViewById(R.id.botonParentesis).setOnClickListener(view -> asignarTexto("()"));

    }

    private void limpiarPantalla(){
        resultEditText.setText("");
    }
    private void asignarTexto(String number){
        resultEditText.append(number);
    }
    private void evaluar(String expresion){
        double resultado = new ExpressionBuilder(expresion).build().evaluate();
        resultEditText.setText("");
        resultEditText.append(Double.toString(resultado));
    }
    public void eliminarUltimoCaracter() {
        String str= String.valueOf(resultEditText.getText());
        if (str!=null && str.length()>0) {
            str=str.substring(0, str.length()-1);
            resultEditText.setText(str);
        }
    }
}