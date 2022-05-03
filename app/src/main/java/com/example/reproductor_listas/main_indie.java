package com.example.reproductor_listas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main_indie extends AppCompatActivity {

    Button btsong1_I,btsong2_I,btsong3_I,btsong4_I,btsong5_I;
    MediaPlayer mp;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indie);

        btsong1_I= (Button) findViewById(R.id.btnSong1_I);
        btsong2_I= (Button) findViewById(R.id.btnSong2_I);
        btsong3_I= (Button) findViewById(R.id.btnSong3_I);
        btsong4_I= (Button) findViewById(R.id.btnSong4_I);
        btsong5_I= (Button) findViewById(R.id.btnSong5_I);
        des=(TextView)findViewById(R.id.txtLink_I);

        btsong1_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp= MediaPlayer.create(main_indie.this,R.raw.jesse_ruben);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=C4NgsbkyeJs");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong2_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_indie.this,R.raw.syml);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=b3LJlZBWI8w");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong3_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_indie.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong4_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_indie.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong5_I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_indie.this,R.raw.balada5);
                    mp.start();
                }
            }
        });
    }
}
