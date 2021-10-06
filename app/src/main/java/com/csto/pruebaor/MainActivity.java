package com.csto.pruebaor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Btn;
    EditText CampoUsuario,CampoClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn = (Button)findViewById(R.id.button);
        CampoClave = (EditText)findViewById(R.id.Cajon2);
        CampoUsuario = (EditText) findViewById(R.id.Cajon1);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Clave = CampoClave.getText().toString();
                String Usuario = CampoUsuario.getText().toString();

                if (Usuario.equals("adm123") && Clave.equals("adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario o clave mala", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}