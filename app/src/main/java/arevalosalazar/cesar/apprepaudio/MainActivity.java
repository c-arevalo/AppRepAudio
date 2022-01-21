package arevalosalazar.cesar.apprepaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    TextView t;

    /*ProgressBar p;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.audio);*/
        t = (TextView) findViewById(R.id.tvMensaje);
        /*p = findViewById(R.id.progressBar1);*/
    }


    public void PlayFromStop(View v) {
        try {
            mp.prepare();
            mp.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lanzarSonido l = new lanzarSonido(t);
        l.execute();
        l.onPostExecute(t);
        /*p.setProgress(mp.getCurrentPosition());*/

    }
    public void PlayFromPausa(View v){
        mp.start();
    }

    public void parar (View v){
        mp.stop();
    }

    public void pausar(View v){
        mp.pause();
    }
}