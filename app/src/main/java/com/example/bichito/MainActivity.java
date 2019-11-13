package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume(); //Este codigo se ejecuta antes de todo.
        //En este punto la aplicación ya cargo

        //this en un activity: es la esencia de una pantalla
        //this es de tipo contexto

        Toast.makeText(this,
                "Aplicación iniciada",
                Toast.LENGTH_LONG).show();

    }
    @Override
    protected  void onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicación Stopeada",
                Toast.LENGTH_LONG).show();
    }
}
