package com.example.reproductor_listas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main_pop extends AppCompatActivity {

    Button btsong1_P,btsong2_P,btsong3_P,btsong4_P,btsong5_P;
    MediaPlayer mp;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        btsong1_P= (Button) findViewById(R.id.btnSong1_P);
        btsong2_P= (Button) findViewById(R.id.btnSong2_P);
        btsong3_P= (Button) findViewById(R.id.btnSong3_P);
        btsong4_P= (Button) findViewById(R.id.btnSong4_P);
        btsong5_P= (Button) findViewById(R.id.btnSong5_P);
        des=(TextView)findViewById(R.id.txtLink_P);

        btsong1_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp= MediaPlayer.create(main_pop.this,R.raw.onerepublic_counting_stars);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=hT_nvWreIhg");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong2_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_pop.this,R.raw.adele_rolling_in_the_deep);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=rYEDA3JcQqw");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong3_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_pop.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong4_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_pop.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong5_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_pop.this,R.raw.balada5);
                    mp.start();
                }
            }
        });
    }
}
