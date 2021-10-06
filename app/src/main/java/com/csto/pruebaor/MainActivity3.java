package com.csto.pruebaor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Spinner Sp1;
    EditText CampoNombre, CampoEdad;
    Button Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Sp1 = (Spinner)findViewById(R.id.spinner);
        CampoEdad = (EditText)findViewById(R.id.CajonE);
        CampoNombre = (EditText)findViewById(R.id.CajonN);
        Btn2 = (Button)findViewById(R.id.button2);

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Nombre = CampoNombre.getText().toString();
                String Edad = CampoEdad.getText().toString();


                if (Nombre.length() == 0 ){
                    Toast.makeText(getApplicationContext(),"Debe ingresar Nombre",Toast.LENGTH_LONG).show();
                }
                if (Edad.length() == 0 ){
                    Toast.makeText(getApplicationContext(),"Debe ingresar Edad",Toast.LENGTH_LONG).show();
                }

                else
                {
                    String Sexo = Sp1.getSelectedItem().toString();
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("GENERO", Sexo);
                    startActivity(I);
                }


            }
        });


    }
}