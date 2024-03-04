package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.animation_btn);

        // создаем анимацию
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        // запуск анимации
        btn.startAnimation(animation);
    }
}