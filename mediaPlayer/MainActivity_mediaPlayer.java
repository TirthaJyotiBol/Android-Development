package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // media player is a predefined class in android
    MediaPlayer player;
    AudioManager audioManager;

/*  starts stops and pauses the media
    onClick listener is added onto the buttons
*/

    public  void play(View view){
        player.start();
    }

    public  void pause(View view){
        player.pause();
    }

    public  void stop(View view){ player.stop(); }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is what we are going to play
        player = MediaPlayer.create(this,R.raw.musicmedia);

        //seekbar for volume
        audioManager = (AudioManager) getSystemService(getBaseContext().AUDIO_SERVICE);
        int maxVol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVol =audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar seekVol = findViewById(R.id.seekVol);
        seekVol.setMax(maxVol);
        seekVol.setProgress(curVol);

        
        /*This one is for the progress seekBar */


        seekVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        SeekBar seekProg = findViewById(R.id.seekProg);
        seekProg.setMax(player.getDuration());

        //timer is used because we want that our music should be played and seekbar to be along with song Automatically

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekProg.setProgress(player.getCurrentPosition());
            }
        },0,900);

        seekProg.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                player.seekTo(progress);

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
