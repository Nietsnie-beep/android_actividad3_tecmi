package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView myImage;
    Button btn_zoom_in, btn_zoom_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImage = (ImageView)findViewById(R.id.imageView);
        btn_zoom_in = (Button)findViewById(R.id.btn_zoomIn);
        btn_zoom_out = (Button)findViewById(R.id.btn_zoomOut);

        btn_zoom_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in);
                myImage.startAnimation(animation);
            }
        });

        btn_zoom_out.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_out);
                myImage.startAnimation(animation);
            }
        });
    }
}