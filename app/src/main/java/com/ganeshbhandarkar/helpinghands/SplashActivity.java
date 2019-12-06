package com.ganeshbhandarkar.helpinghands;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView,lottieAnimationView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById(R.id.LottieAnimationView);
        startCheckAnimation();

        lottieAnimationView2 = findViewById(R.id.LottieAnimationView2);
        startCheckAnimation2();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                LoginActivity();
                lottieAnimationView.cancelAnimation();
                lottieAnimationView2.cancelAnimation();
            }
        }, 4000);

    }

    private void LoginActivity() {

        Intent loginIntent = new Intent(SplashActivity.this,MainActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        finish();
    }

    private void startCheckAnimation(){
        ValueAnimator animator=ValueAnimator.ofFloat(0f,1f).setDuration(3000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lottieAnimationView.setProgress((Float)animation.getAnimatedValue());
            }
        });
        if(lottieAnimationView.getProgress()==0f){
            animator.start();
        }else {
            lottieAnimationView.setProgress(0f);
        }
    }

    private void startCheckAnimation2(){
        ValueAnimator animator=ValueAnimator.ofFloat(0f,1f).setDuration(3000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                lottieAnimationView2.setProgress((Float)animation.getAnimatedValue());
            }
        });
        if(lottieAnimationView2.getProgress()==0f){
            animator.start();
        }else {
            lottieAnimationView2.setProgress(0f);
        }
    }
}
