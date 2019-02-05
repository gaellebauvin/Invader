package fr.iutlens.mmi.invader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gameView = findViewById(R.id.gameView);

        View gameOver = findViewById(R.id.imageViewGameOver);
        gameView.setGameOver(gameOver);

        View Newgame = findViewById(R.id.newgame);
        gameView.setNewgame(Newgame);

            }




    public void onLeft(View view) {
        gameView.onLeft();
        gameView.onFire();
    }

    public void onRight(View view) {
        gameView.onRight();
        gameView.onFire();
    }

    public void game(View View) {
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }

/*
    public void onFire(View view) {
        gameView.onFire();
    } */
}
