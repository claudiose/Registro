package com.example.gundam.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;



public class MainActivity extends AppCompatActivity {
     private Button btn_aceptar;
     private EditText et_nombre , et_apellido , et_edad , et_correo , et_pass , et_repetirpass;
     private RadioButton rb_masculino, rb_femenino, rb_soltero, rb_casado, rb_otro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_aceptar = (Button) findViewById(R.id.btn_aceptar);
        et_nombre = (EditText) findViewById(R.id.et_nombre);
        et_apellido = (EditText) findViewById(R.id.et_apellido);
        et_edad = (EditText) findViewById(R.id.et_edad);
        et_correo = (EditText) findViewById(R.id.et_correo);
        et_pass = (EditText) findViewById(R.id.et_pass);
        et_repetirpass = (EditText) findViewById(R.id.et_repetirpass);
        rb_masculino = (RadioButton) findViewById(R.id.rb_masculino);
        rb_femenino = (RadioButton) findViewById(R.id.rb_femenino);
        rb_soltero = (RadioButton) findViewById(R.id.rb_soltero);
        rb_casado = (RadioButton) findViewById(R.id.rb_casado);
        rb_otro = (RadioButton) findViewById(R.id.rb_otro);




        btn_aceptar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            });

    }





    }


