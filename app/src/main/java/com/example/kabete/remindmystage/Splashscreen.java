package com.example.kabete.remindmystage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {
private ImageView imageview;
private Button buttontext;
private ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        imageview = (ImageView)findViewById(R.id.image_view);
        buttontext = (Button)findViewById(R.id.text_button);
        progressbar = (ProgressBar) findViewById(R.id.progress_bar);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        imageview.startAnimation(myanim);
        buttontext.startAnimation(myanim);
        progressbar.startAnimation(myanim);
        final Intent transition = new Intent(this,Homepage.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();

                }
                finally{
                    startActivity(transition);
                    finish();
                }
            }
        };
        timer.start();
    }
}
