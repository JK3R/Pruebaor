package com.csto.pruebaor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageButton BtnImage;
    String GENERO;
    TextView CampoTotal, CampoH, CampoM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CampoH = (TextView)findViewById(R.id.CajonH);
        CampoM = (TextView)findViewById(R.id.CajonM);
        CampoTotal = (TextView)findViewById(R.id.CajonT);
        BtnImage = (ImageButton)findViewById(R.id.imageButton);


        Bundle B = getIntent().getExtras();
        GENERO = B.getString("GENERO");


        if((GENERO.equals("MUJER")))
        {
            CampoM.setText("GENERO");
        }

        if((GENERO.equals("HOMBRE")))
        {
            CampoH.setText("GENERO");
        }

        BtnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(I);



            }
        });

    }
}