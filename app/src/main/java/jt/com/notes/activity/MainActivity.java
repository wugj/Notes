package jt.com.notes.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jt.com.notes.R;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void explode(View view){
        intent = new Intent(this, TransitionsActivity.class);
        intent.putExtra("flag", 0);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
        }
    }

    public void slide(View view){
        intent = new Intent(this, TransitionsActivity.class);
        intent.putExtra("flag", 1);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
        }
    }

    public void fade(View view){
        intent = new Intent(this, TransitionsActivity.class);
        intent.putExtra("flag", 2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
        }
    }

    public void share(View view){
        View fab = findViewById(R.id.fab_button);
        intent = new Intent(this, TransitionsActivity.class);
        intent.putExtra("flag", 3);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this, fab, "share").toBundle());
        }
    }
}
