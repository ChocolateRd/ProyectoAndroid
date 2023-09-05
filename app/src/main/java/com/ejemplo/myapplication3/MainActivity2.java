package com.ejemplo.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    // Declarar los componentes de la vista que se van a usar
    private TextView usernameTextView;
    private TextView passwordTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Mensaje emergente
        Toast.makeText(getApplicationContext(),"Ingresando al Sistema ", Toast.LENGTH_LONG).show();

        // Crear los componentes de la vista (asignar el valor de la vista a la variable declarada)
        usernameTextView = findViewById(R.id.textNomb);
        passwordTextView = findViewById(R.id.textContra);

        // Recupera los valores del Intent
        String username = getIntent().getStringExtra("user_name");
        String password = getIntent().getStringExtra("password");

        // Muestra los valores en los elementos correspondientes
        usernameTextView.setText(username);
        passwordTextView.setText(password);

    }
}