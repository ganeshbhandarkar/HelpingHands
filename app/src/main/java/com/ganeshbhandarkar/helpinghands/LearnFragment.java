package com.ganeshbhandarkar.helpinghands;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ganeshbhandarkar.helpinghands.Articles.ArticleFragment;
import com.ganeshbhandarkar.helpinghands.Chapters.ChaptersActivity;
import com.ganeshbhandarkar.helpinghands.Video.VideoFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class LearnFragment extends Fragment {

    private AppBarLayout appBarLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView openChaptersButton;


    private View view;


    public LearnFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      view =  inflater.inflate(R.layout.fragment_learn,container,false);
      init();
      return view;
    }

    private void init(){

        openChaptersButton = view.findViewById(R.id.open_chapters);
        appBarLayout = view.findViewById(R.id.app_bar_learn);
        tabLayout = view.findViewById(R.id.tabbar_learn);
        viewPager = view.findViewById(R.id.viewPager_learn);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new VideoFragment(),"Media");
        adapter.AddFragment(new ArticleFragment(),"Articles");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        openChaptersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ChaptersActivity.class);
                startActivity(i);
                setAllowEnterTransitionOverlap(true);
            }
        });


    }

}
