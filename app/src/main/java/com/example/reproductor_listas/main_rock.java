package com.example.reproductor_listas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main_rock extends AppCompatActivity {

    Button btsong1_R,btsong2_R,btsong3_R,btsong4_R,btsong5_R;
    MediaPlayer mp;
    TextView des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        btsong1_R= (Button) findViewById(R.id.btnSong1_R);
        btsong2_R= (Button) findViewById(R.id.btnSong2_R);
        btsong3_R= (Button) findViewById(R.id.btnSong3_R);
        btsong4_R= (Button) findViewById(R.id.btnSong4_R);
        btsong5_R= (Button) findViewById(R.id.btnSong5_R);
        des=(TextView)findViewById(R.id.txtLink_R);

        btsong1_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp= MediaPlayer.create(main_rock.this,R.raw.castle_of_glass);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=x2umzqh8r4g");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong2_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_rock.this,R.raw.faint_linkin_park);
                    mp.start();
                    des.setText("https://www.youtube.com/watch?v=LYU-8IFcDPw");
                    des.setLinksClickable(true);
                }
            }
        });

        btsong3_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_rock.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong4_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_rock.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

        btsong5_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.stop();
                }else{
                    mp=MediaPlayer.create(main_rock.this,R.raw.balada5);
                    mp.start();
                }
            }
        });

    }

}
