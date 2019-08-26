package com.example.soluciontaller_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int fondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnFondo1).setOnClickListener(this);
        findViewById(R.id.btnFondo2).setOnClickListener(this);
        findViewById(R.id.btnFondo3).setOnClickListener(this);
        findViewById(R.id.btnFondo4).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


        View vista = view.getRootView();

        if(view.getId() == R.id.btnFondo1){
            //rojo
            fondo = Color.parseColor("#ff0000");
            vista.setBackgroundColor(fondo);
        }
        else if (view.getId() == R.id.btnFondo2){
            //Marron
            fondo = Color.parseColor("#800000");
            vista.setBackgroundColor(fondo);
        }
        else if (view.getId() == R.id.btnFondo3){
            //Teal
            fondo = Color.parseColor("#008080");
            vista.setBackgroundColor(fondo);
        }
        else if (view.getId() == R.id.btnFondo4){
            //Silver
            fondo = Color.parseColor("#c0c0c0");
            vista.setBackgroundColor(fondo);
        }
    }
}

