package com.example.reproductor_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btBaL,btElec,btInd,btPop,btRock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir_baladas(View view){
        Intent ab=new Intent(MainActivity.this,main_baladas.class);
        startActivity(ab);
    }
    public void abrir_electronica(View view){
        Intent ae=new Intent(MainActivity.this,main_electronica.class);
        startActivity(ae);
    }
    public void abrir_indie(View view){
        Intent ai=new Intent(MainActivity.this,main_indie.class);
        startActivity(ai);
    }
    public void abrir_pop(View view){
        Intent ap=new Intent(MainActivity.this,main_pop.class);
        startActivity(ap);
    }
    public void abrir_rock(View view){
        Intent ar=new Intent(MainActivity.this,main_rock.class);
        startActivity(ar);
    }
}