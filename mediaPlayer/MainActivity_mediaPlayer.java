package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // media player is a predefined class in android

    MediaPlayer player;

/*  starts stops and pauses the media
    onClick listener is added onto the buttons
*/

    public  void play(View view){
        player.start();
    }

    public  void pause(View view){
        player.pause();
    }

    public  void stop(View view){
        player.stop();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is what we are going to play
        player = MediaPlayer.create(this,R.raw.musicmedia);
    }
}