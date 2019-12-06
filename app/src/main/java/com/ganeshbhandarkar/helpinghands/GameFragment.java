package com.ganeshbhandarkar.helpinghands;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ganeshbhandarkar.helpinghands.Games.AcademicaActivity;
import com.ganeshbhandarkar.helpinghands.Games.CgGameActivity;
import com.ganeshbhandarkar.helpinghands.Games.FunTimeActivity;

import java.util.ArrayList;
import java.util.zip.Inflater;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

import static io.fabric.sdk.android.services.concurrency.AsyncTask.init;

public class GameFragment extends Fragment {


    private View view;
    private Button button;
    private ImageView academica_game,cg_game,funTime_game;
    private Animation animation;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_game, container, false);
        init();

        animation = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_from_up_to_down);
        academica_game.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_from_up2);
        cg_game.setAnimation(animation);

        animation = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_from_up3);
        funTime_game.setAnimation(animation);


        return view;
    }


    private void init() {




        ScrollView scrollView = (ScrollView) view.findViewById(R.id.scroll_view);
        OverScrollDecoratorHelper.setUpOverScroll(scrollView);

        academica_game = view.findViewById(R.id.academica);
        cg_game = view.findViewById(R.id.cg_games);
        funTime_game = view.findViewById(R.id.fun_time);

        academica_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AcademicaActivity.class);
                startActivity(i);
            }
        });

        cg_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getActivity(), CgGameActivity.class);
                startActivity(j);
            }
        });

        funTime_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getActivity(), FunTimeActivity.class);
                startActivity(k);
            }
        });


        button = view.findViewById(R.id.gameactivity_open);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),GameCategoryActivity.class);
                startActivity(i);
                setAllowEnterTransitionOverlap(true);
            }
        });




//        arrayList = new ArrayList<>();
//
//
//        verticalRecyclerView = view.findViewById(R.id.recyclerView_Vertical);
//        verticalRecyclerView.setHasFixedSize(true);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
//
//        verticalRecyclerView.setLayoutManager(layoutManager);


    }
}
