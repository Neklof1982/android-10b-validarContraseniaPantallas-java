package com.example.a10_practica_02_crearpantallasverpantallas;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText pass = findViewById(R.id.textPass);
        Button validar = findViewById(R.id.buttonComprobar);

        validar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento1 = new Intent(MainActivity.this, Validacion.class);

                String validacion = String.valueOf(pass.getText());

                if (validacion.equals("abc123")) {
                    startActivity(intento1);

                } else {
                    Toast error = Toast.makeText(MainActivity.this,"Error en la contraseñaa", Toast.LENGTH_SHORT);
                    error.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 50);
                    error.show();
                }
            }
        });


    }
}