package com.ganeshbhandarkar.helpinghands.Games;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.ganeshbhandarkar.helpinghands.R;

import java.util.ArrayList;
import java.util.List;

public class AcademicaActivity extends AppCompatActivity {

    private static final String TAG = "AcademicaActivity";
    private static final int NUM_COLUMN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_section_layout);

        RecyclerView recyclerView = findViewById(R.id.games_recycle_view);

        List<GameSectionModel> gameSectionModelList = new ArrayList<>();
        gameSectionModelList.add(new GameSectionModel(R.drawable.kids,"https://play.google.com/store/apps/details?id=com.orange.coloring.learn.kids"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.free,"https://play.google.com/store/apps/details?id=com.agandeev.mathgames.free"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.table,"https://play.google.com/store/apps/details?id=de.softan.multiplication.table"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.mentalup,"https://play.google.com/store/apps/details?id=com.ayasis.mentalup"));
        gameSectionModelList.add(new GameSectionModel(R.drawable.word,"https://play.google.com/store/apps/details?id=wordgame.words.puzzle.connect.match.search"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));
//        gameSectionModelList.add(new GameSectionModel(R.drawable.game_demo,"https://play.google.com/store/apps/details?id=com.dts.freefireth"));



        GameSectionAdapter adapter = new GameSectionAdapter(this,gameSectionModelList);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMN, LinearLayoutManager.VERTICAL);


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
    }
}
