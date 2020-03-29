package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view)
    {
        ImageView bart=(ImageView)findViewById(R.id.imageView);
        ImageView homer=(ImageView)findViewById(R.id.imageView1);


        bart.animate().translationXBy(1000).rotation(3600).alpha(1).setDuration(1000);

//animate between two images continuosly
//        if(bart.getAlpha() == 0)
//        {
//
//            bart.animate().alpha(1).setDuration(2000);
//            homer.animate().alpha(0).setDuration(2000);
//        }
//        else
//        {
//
//            bart.animate().alpha(0).setDuration(2000);
//            homer.animate().alpha(1).setDuration(2000);
//        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bart=(ImageView)findViewById(R.id.imageView);

        bart.animate().translationXBy(-1000);
    }
}
