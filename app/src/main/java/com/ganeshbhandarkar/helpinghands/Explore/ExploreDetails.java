package com.ganeshbhandarkar.helpinghands.Explore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ganeshbhandarkar.helpinghands.R;

public class ExploreDetails extends AppCompatActivity {

    TextView authorName;
    TextView readMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_details);

//        authorName = findViewById(R.id.authorName);
        readMode = findViewById(R.id.activityData);

        String read = getIntent().getExtras().getString("data");
        readMode.setText(read);

//        String author = getIntent().getExtras().getString("author");
//        authorName.setText(author);
    }
}
