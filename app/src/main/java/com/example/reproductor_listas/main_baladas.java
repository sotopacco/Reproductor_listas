package com.example.reproductor_listas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main_baladas extends AppCompatActivity {

    Button btsong1_B,btsong2_B,btsong3_B,btsong4_B,btsong5_B;
    MediaPlayer mp;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baladas);

        btsong1_B= (Button) findViewById(R.id.btnSong1_B);
        btsong2_B= (Button) findViewById(R.id.btnSong2_B);
        btsong3_B= (Button) findViewById(R.id.btnSong3_B);
        btsong4_B= (Button) findViewById(R.id.btnSong4_B);
        btsong5_B= (Button) findViewById(R.id.btnSong5_B);
        des=(TextView)findViewById(R.id.txtLink_B);

        btsong1_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_baladas.this,R.raw.dire_straits_walk_of_life);
                    mp.start();
                    /*des.setText("https://www.youtube.com/watch?v=kd9TlGDZGkI");
                    des.setLinksClickable(true);*/
                }
            }
        });

        btsong2_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_baladas.this,R.raw.michael_kackson_bad);
                    mp.start();
                    /*des.setText("https://www.youtube.com/watch?v=dsUXAEzaC3Q");
                    des.setLinksClickable(true);*/
                }
            }
        });

        btsong3_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_baladas.this,R.raw.balada3);
                    mp.start();
                }
            }
        });

        btsong4_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_baladas.this,R.raw.balada4);
                    mp.start();
                }
            }
        });
        btsong5_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_baladas.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

    }

}
