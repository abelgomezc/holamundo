package com.abel.gomez.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText email;
    private EditText contra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicAceptar(View view){

        Intent intent = new Intent(this ,MenuActivity.class);
        //Enlazar el intent con la clase a la q va iniciar la actividad

        email  = (EditText)findViewById(R.id.editTextTextEmailAddress2);
        contra = (EditText)findViewById(R.id.editTextTextPassword2);


        //Enviamostodo la informacion q vamos.
        intent.putExtra("emailMenu",String.valueOf(email.getText()));

        intent.putExtra("passwordMenu",String.valueOf(contra.getText()));

        startActivity(intent);


        Toast.makeText(this, "email :"+ email.getText()+" \n Contraseña : "+contra.getText(), Toast.LENGTH_SHORT).show();


    }
}