package com.example.practica;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Random random = new Random();
    private Toast toastActual = null;

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

        findViewById(R.id.dado20).setOnClickListener(view -> lanzarDado(20));
        findViewById(R.id.dado12).setOnClickListener(view -> lanzarDado(12));
        findViewById(R.id.dado6).setOnClickListener(view -> lanzarDado(6));

    }

    private void lanzarDado(int size){
        int tirada = random.nextInt(size)+1;

        String texto = "¡Haz tirado un "+tirada+"!";

        if(toastActual!=null)
            toastActual.cancel();

        toastActual = Toast.makeText(MainActivity.this, texto,Toast.LENGTH_SHORT);
        toastActual.show();
    }
}