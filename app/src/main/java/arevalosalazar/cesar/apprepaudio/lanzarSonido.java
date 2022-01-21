package arevalosalazar.cesar.apprepaudio;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class lanzarSonido extends AsyncTask {
    TextView t;

    lanzarSonido(View v){
        t=(TextView)v;
    }
    @Override
    protected Object doInBackground(Object[] params){

        MediaPlayer mp = new MediaPlayer();
        try{
            mp.setDataSource("https://rpg.hamsterrepublic.com/wiki-images/3/3b/EnemyDeath.ogg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            mp.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        return null;
    }

    @Override
    protected void onPostExecute(Object o){
        t.setText("Tarea finalizada");
    }
}
