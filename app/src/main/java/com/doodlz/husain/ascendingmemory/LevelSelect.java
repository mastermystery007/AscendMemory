package com.doodlz.husain.ascendingmemory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by husai on 18-08-2018.
 */

public class LevelSelect extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
    }

    public void easyBtnClicked(View view) {
        Intent intent =new Intent(LevelSelect.this,MainActivity.class);
        intent.putExtra("level",5);
        startActivity(intent);
    }

    public void mediumBtnClicked(View view) {
        Intent intent =new Intent(LevelSelect.this,MainActivity.class);
        intent.putExtra("level",7);
        startActivity(intent);
    }

    public void hardBtnClicked(View view) {
        Intent intent =new Intent(LevelSelect.this,MainActivity.class);
        intent.putExtra("level",9);
        startActivity(intent);
    }

    public void insaneBtnClicked(View view) {
        Intent intent =new Intent(LevelSelect.this,MainActivity.class);
        intent.putExtra("level",11);
        startActivity(intent);
    }
}
