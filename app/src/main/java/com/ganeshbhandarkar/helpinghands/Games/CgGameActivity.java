package com.ganeshbhandarkar.helpinghands.Games;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.ArrayList;
import java.util.List;

public class CgGameActivity extends AppCompatActivity {

    private static final String TAG = "AcademicaActivity";
    private static final int NUM_COLUMN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_section_layout);


        RecyclerView recyclerView = findViewById(R.id.games_recycle_view);

        List<GameSectionModel> gameSectionModelList = new ArrayList<>();

        gameSectionModelList.add(new GameSectionModel(R.drawable.connect,"https://play.google.com/store/apps/details?id=com.launchshipstudios.dots.connect"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.snake,"https://play.google.com/store/apps/details?id=com.amelosinteractive.snake"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.puzzle,"https://play.google.com/store/apps/details?id=com.leodesol.games.puzzlecollection"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.songs,"https://play.google.com/store/apps/details?id=com.orange.kidspiano.music.songs"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.remembry,"https://play.google.com/store/apps/details?id=ua.krou.remembery"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));




        GameSectionAdapter adapter = new GameSectionAdapter(this,gameSectionModelList);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMN, LinearLayoutManager.VERTICAL);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
    }
}
