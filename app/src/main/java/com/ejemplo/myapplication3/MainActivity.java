package com.ejemplo.myapplication3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaracion de los componentes de la vista
    private EditText usernameTextView;
    private EditText passwordEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CREA - BUSQUEDA
        usernameTextView = findViewById(R.id.editNombre);
        passwordEditText = findViewById(R.id.editTextTextPassword);
    }

    //METODO “enviarDatos”
    public void ingresarSistemas (View view) {
        //Recuperar los datos que se ingresaron (los textos que ingreso el usuario)
        String username = usernameTextView.getText().toString();
        String password = passwordEditText.getText().toString();
                                        // CharS : h o l a
                                        //.toString() : hola

        // I. Cambiar a activity2
        Intent actividad2 = new Intent(this,MainActivity2.class);

        // Para enviar datos desde una activity hacia otra se usa el metodo putExtra, siempre identificando el valor que se enviará
        actividad2.putExtra("user_name", username);
        actividad2.putExtra("password", password);
        startActivity(actividad2);
    }



}