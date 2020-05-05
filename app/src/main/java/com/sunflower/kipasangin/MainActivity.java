package com.sunflower.kipasangin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation rotationAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        rotateAnimation();
    }

    private void rotateAnimation() {
        rotationAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
        imageView.startAnimation(rotationAnimation);
    }
}
