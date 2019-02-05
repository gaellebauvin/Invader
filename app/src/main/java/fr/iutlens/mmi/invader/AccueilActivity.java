package fr.iutlens.mmi.invader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void pagesuivante(View View) {
        //    activity_game.pagesuivante();
        Intent intent = new Intent(this,GameActivity.class);
        startActivity(intent);
    }
}
