package fr.iutlens.mmi.invader;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;
    public SoundPool soundPool;
    public int soundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameView = findViewById(R.id.gameView);

        View gameOver = findViewById(R.id.imageViewGameOver);
        gameView.setGameOver(gameOver);

        View newgame = findViewById(R.id.newgame);
        gameView.setNewgame(newgame);

//        soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
//        soundId = soundPool.load(this, R.raw.sound, 0);

            }




    public void onLeft(View view) {
        gameView.onLeft();
        gameView.onFire();
    }

    public void onRight(View view) {
        gameView.onRight();
        gameView.onFire();
    }

    public void game(View view) {
       // Intent intent = new Intent(this,GameActivity.class);
       // startActivity(intent);
        if (view.getVisibility() == View.VISIBLE) gameView.restart();
    }

/*
    public void onFire(View view) {
        gameView.onFire();
    } */
}
