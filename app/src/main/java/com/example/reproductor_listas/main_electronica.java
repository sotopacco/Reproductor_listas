package com.example.reproductor_listas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main_electronica extends AppCompatActivity {

    Button btsong1_E,btsong2_E,btsong3_E,btsong4_E,btsong5_E;
    MediaPlayer mp;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronica);

        btsong1_E= (Button) findViewById(R.id.btnSong1_E);
        btsong2_E= (Button) findViewById(R.id.btnSong2_E);
        btsong3_E= (Button) findViewById(R.id.btnSong3_E);
        btsong4_E= (Button) findViewById(R.id.btnSong4_E);
        btsong5_E= (Button) findViewById(R.id.btnSong5_E);
        des=(TextView)findViewById(R.id.txtLink_E);
        //Me falta cambiar las canciones
        btsong1_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp= MediaPlayer.create(main_electronica.this,R.raw.galantis_runaway);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=_ovdm2yX4MA");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong2_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_electronica.this,R.raw.avicii_levels);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=szj59j0hz_4");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong3_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_electronica.this,R.raw.balada4);
                    mp.start();
                }
            }
        });

        btsong4_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_electronica.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong5_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_electronica.this,R.raw.balada5);
                    mp.start();
                }
            }
        });
    }
}
