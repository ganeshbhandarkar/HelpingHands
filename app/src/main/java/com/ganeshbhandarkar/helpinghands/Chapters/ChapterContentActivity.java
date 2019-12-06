package com.ganeshbhandarkar.helpinghands.Chapters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ganeshbhandarkar.helpinghands.R;
import com.ganeshbhandarkar.helpinghands.TopicActivity;

import java.util.ArrayList;
import java.util.List;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class ChapterContentActivity extends AppCompatActivity {

    private ImageView imageView;
    private CardView topic1,topic2,topic3;
    TextView textView;
    List<ContentModel> contentModelList;
    RecyclerView recyclerView;
    String readmode1,readmode2,readmode3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_content);

        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);
        textView = findViewById(R.id.alliswell);

        readmode1 = getIntent().getExtras().getString("read1");
        readmode2 = getIntent().getExtras().getString("read2");
        readmode3 = getIntent().getExtras().getString("read3");
//            textView.setText(readmode1);


//        List<ContentModel> contentModelList= new ArrayList<>();
//        contentModelList.add(new ContentModel("Block 1",R.drawable.chapter1,"What is childhood?\n" +
//                "“Childhood is not a natural biological state, rather childhood is a social role and the norms attached to childhood vary across societies.” But still there are some universal laws for every child in every community like infants/toddler are not socially constructed because they are dependent on adults which seem not to be socialized. Age group from 5 to 12, still somewhere they are not well socialized, being social after age of 15 makes more sense. And last group from age 15 to till person is alive, by adolescence it makes more sense. If childhood has not any relation with society then the question is \n" +
//                "“Is childhood socially constructed?”\n" +
//                "- Yes\n" +
//                "If childhood is socially constructed, then it Must be varies through cultures (anthropological evidence).\n" +
//                "Children everywhere go through the same stages of physical Development but cultures construct these stages differently like some people believe that baby must be clean every time to maintain hygiene and provide their child new clothes but some cultures people believe that child must be wore old clothes to get avoid from “Nazar”.\n"));
//


        topic1 = findViewById(R.id.card1);
        topic2 = findViewById(R.id.card2);
        topic3 = findViewById(R.id.card3);
//        topic4 = findViewById(R.id.card4);

        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topic = new Intent(ChapterContentActivity.this, TopicActivity.class);
                topic.putExtra("rea",readmode1);
                startActivity(topic);
            }
        });

        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topic = new Intent(ChapterContentActivity.this, TopicActivity.class);
                topic.putExtra("rea",readmode2);
                startActivity(topic);
            }
        });

        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topic = new Intent(ChapterContentActivity.this, TopicActivity.class);
                topic.putExtra("rea",readmode3);
                startActivity(topic);
            }
        });
//
//        topic4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent topic = new Intent(ChapterContentActivity.this, TopicActivity.class);
//                startActivity(topic);
//            }
//        });



//        RecyclerView recyclerView = findViewById(R.id.recyclerViewChapterContent);
//
//        ContentAdapter adapter = new ContentAdapter(contentModelList,this);
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(adapter);
//
//
//        String blockName = getIntent().getExtras().getString("blockName");



    }
}
