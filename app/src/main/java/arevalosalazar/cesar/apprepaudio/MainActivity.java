package arevalosalazar.cesar.apprepaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.audio);
    }


    public void play(View v){
        try {
            mp.prepare();
            mp.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reanudar(View v){
        mp.start();
    }

    public void parar (View v){
        mp.stop();
    }

    public void pausar(View v){
        mp.pause();
    }
}