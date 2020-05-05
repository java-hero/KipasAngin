package com.sunflower.kipasangin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Animation rotationAnimation;
    ImageView imageView;
    Button buttonON , buttonOFF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.kipasBlade);
        buttonON = findViewById(R.id.buttonOn);
        buttonOFF = findViewById(R.id.buttonOFF);

        buttonON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartRotateAnimation();
            }
        });

        buttonOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StopRotateAnimation();
            }
        });

    }

    private void StartRotateAnimation() {
        rotationAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        imageView.startAnimation(rotationAnimation);
        Toast.makeText(this, "Kipas Nyala", Toast.LENGTH_SHORT).show();
    }

    private void StopRotateAnimation() {
        imageView.clearAnimation();
        Toast.makeText(this, "Kipas Mati", Toast.LENGTH_SHORT).show();
    }
}
