package com.ganeshbhandarkar.helpinghands.Games;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.ArrayList;
import java.util.List;

public class FunTimeActivity extends AppCompatActivity {

    private static final String TAG = "AcademicaActivity";
    private static final int NUM_COLUMN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_section_layout);

        RecyclerView recyclerView = findViewById(R.id.games_recycle_view);

        List<GameSectionModel> gameSectionModelList = new ArrayList<>();

        gameSectionModelList.add(new GameSectionModel(R.drawable.puzzle,"https://play.google.com/store/apps/details?id=com.babyhub.kids.maze.educational.puzzle"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.abc,"https://play.google.com/store/apps/details?id=com.gamesforkids.preschoolworksheets.alphabets"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.fun,"https://play.google.com/store/apps/details?id=air.com.shubi.LearnCNLW.english"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.attention,"https://play.google.com/store/apps/details?id=com.tellmewow.senior.attention"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.freefire,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));



        GameSectionAdapter adapter = new GameSectionAdapter(this,gameSectionModelList);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMN, LinearLayoutManager.VERTICAL);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);




    }
}
