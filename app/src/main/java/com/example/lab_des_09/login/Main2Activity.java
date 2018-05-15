package com.example.lab_des_09.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getActionBar().hide();
        requestWindowFeature(Window.FEATURE_NO_TITLE);//borrar la barra de arriba con el nombre del proyecto
        setContentView(R.layout.activity_main2);

        Button cerrar  = (Button) findViewById(R.id.cer);

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Inicio2 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(Inicio2);
            }
        });


    }

}
