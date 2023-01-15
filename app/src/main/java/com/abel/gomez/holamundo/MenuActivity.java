package com.abel.gomez.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;




public class MenuActivity extends AppCompatActivity {

    TextView textCommensalism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent intent = getIntent();
        //Obtenemos el inten que creamos
        String usuarioBundle =  intent.getStringExtra("emailMenu");
        String passwordBundle = intent.getStringExtra("passwordMenu");

        textCommensalism = (TextView)findViewById(R.id.txtvista2id);
        textCommensalism.setText("Usuario : "+ usuarioBundle + "\n Contraseña =  " + passwordBundle);

    }

    public void anterior(View view){


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}