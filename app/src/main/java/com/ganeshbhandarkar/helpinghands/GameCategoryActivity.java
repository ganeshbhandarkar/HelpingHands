package com.ganeshbhandarkar.helpinghands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.ganeshbhandarkar.helpinghands.Games.AcademicaActivity;
import com.ganeshbhandarkar.helpinghands.Games.CgGameActivity;
import com.ganeshbhandarkar.helpinghands.Games.FunTimeActivity;
import com.ganeshbhandarkar.helpinghands.Games.GameSectionAdapter;

import java.util.ArrayList;
import java.util.List;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class GameCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_category);

        Button acedemica = findViewById(R.id.more_academica);
        Button cg_game = findViewById(R.id.more_cg_game);
        Button funTime = findViewById(R.id.more_funtime);

        acedemica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameCategoryActivity.this, AcademicaActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
            }
        });

        cg_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameCategoryActivity.this, CgGameActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
            }
        });

        funTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GameCategoryActivity.this, FunTimeActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.pull_up_from_buttom,R.anim.fade_out);
            }
        });




        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerView2);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerView3);

        TextView textView = findViewById(R.id.text);
        TextView textView1 = findViewById(R.id.text2);
        TextView textView2 = findViewById(R.id.text3);


        List<GameModel> gameList = new ArrayList<>();
        gameList.add(new GameModel(R.drawable.game_demo));
        gameList.add(new GameModel(R.drawable.game_demo));
        gameList.add(new GameModel(R.drawable.game_demo));

        GameAdapter adapter = new GameAdapter(this,gameList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView1.setAdapter(adapter);


        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(adapter);


    }
}
