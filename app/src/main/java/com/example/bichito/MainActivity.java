package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Enlazamos activity con Layout

        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProducts.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Log.i(Settings.INFO, "Products");

                //Intent sirve para cambiar de pantalla
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Log.i(Settings.INFO, "Products");
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });

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
