package com.example.proyecto;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Establecer la imagen de fondo para el encabezado
        LinearLayout headerLayout = findViewById(R.id.header);
        headerLayout.setBackgroundResource(R.drawable.modelos);
    }
}
