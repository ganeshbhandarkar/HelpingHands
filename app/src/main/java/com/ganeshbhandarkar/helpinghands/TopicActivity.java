package com.ganeshbhandarkar.helpinghands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ganeshbhandarkar.helpinghands.Chapters.ChapterContentActivity;

public class TopicActivity extends AppCompatActivity {
    TextView reading_mode;
    private CardView hindi,eng,marathi,soon;
    private Button back_button;
    ImageView imageView;
    String readmc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

//        Bundle bundle = getIntent().getExtras();
//        read = bundle.getString("rea");
//
//        final String readmode1 = getIntent().getExtras().getString("readMode1");

        readmc = getIntent().getExtras().getString("rea");

        imageView = findViewById(R.id.pause_play);
        reading_mode = findViewById(R.id.read_abstract);

        reading_mode.setText(readmc);

        reading_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readingintent = new Intent(TopicActivity.this,ReadModeActivity.class);
                readingintent.putExtra("readmcc",readmc);
                startActivity(readingintent);
            }
        });


       hindi = findViewById(R.id.hindi);
       eng = findViewById(R.id.eng);
       marathi = findViewById(R.id.marathi);
       soon = findViewById(R.id.coming_soon);

        final MediaPlayer mediaPlayer= new MediaPlayer().create(this,R.raw.music);

       hindi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(TopicActivity.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
//               if(mediaPlayer.isPlaying()){
//                   mediaPlayer.pause();
//                   imageView.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
//               }else{
//                   mediaPlayer.start();
//                   imageView.setBackgroundResource(R.drawable.ic_pause_black_24dp);
//               }
           }
       });

       eng.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(TopicActivity.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
//               if(mediaPlayer.isPlaying()){
//                   mediaPlayer.pause();
//                   imageView.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
//               }else{
//                   mediaPlayer.start();
//                   imageView.setBackgroundResource(R.drawable.ic_pause_black_24dp);
//               }
           }
       });

       marathi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(TopicActivity.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
//               if(mediaPlayer.isPlaying()){
//                   mediaPlayer.pause();
//                   imageView.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
//               }else{
//                   mediaPlayer.start();
//                   imageView.setBackgroundResource(R.drawable.ic_pause_black_24dp);
//               }
           }
       });

       soon.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(TopicActivity.this, "Coming Soon....", Toast.LENGTH_SHORT).show();
//               if(mediaPlayer.isPlaying()){
//                   mediaPlayer.pause();
//                   imageView.setBackgroundResource(R.drawable.ic_play_arrow_black_24dp);
//               }else{
//                   mediaPlayer.start();
//                   imageView.setBackgroundResource(R.drawable.ic_pause_black_24dp);
//               }
           }
       });

       back_button =findViewById(R.id.back_button);

       back_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(TopicActivity.this, ChapterContentActivity.class);
               startActivity(intent);
               overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
           }
       });


    }
}
