package com.example.eventos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /**
     * Método principal que se llama al crear la actividad.
     * Configura el layout de la actividad y maneja los clics del botón.
     *
     * @param savedInstanceState Instancia del estado guardado de la actividad.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Manejo del clic del botón
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "¡Has clicado el botón!", Toast.LENGTH_SHORT).show();
            }
        });

        // Manejo del toque largo en el botón
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "¡Has hecho un toque largo en el botón!", Toast.LENGTH_SHORT).show();
                return true; // Indicar que el evento ha sido consumido
            }
        });

    }
    /**
     * Método que maneja el evento onTouchEvent.
     * Muestra un mensaje Toast cuando se toca la pantalla.
     *
     * @param event Evento de toque.
     * @return Si el evento ha sido manejado.
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            // Acción cuando se toca la pantalla
            Toast.makeText(this, "¡Has tocado la pantalla!", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onTouchEvent(event);
    }
}