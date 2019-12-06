package com.ganeshbhandarkar.helpinghands;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReadModeActivity extends AppCompatActivity {

    TextView textView;
    String readmodeon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_mode);

        textView = findViewById(R.id.readmodeon);

        readmodeon = getIntent().getExtras().getString("readmcc");

//        String readmode1 = getIntent().getExtras().getString("readMode1");
        textView.setText(readmodeon);
    }
}
