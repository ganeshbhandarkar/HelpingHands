package com.ganeshbhandarkar.helpinghands;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.ganeshbhandarkar.helpinghands.Explore.ExploreFragment;
import com.google.android.material.tabs.TabLayout;

public class BuildFragment extends Fragment {


    private View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_build,container,false);
        init();
        return view;
    }


    private void init(){
        tabLayout = view.findViewById(R.id.tablayout_id);
        viewPager = view.findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new ExploreFragment(),"Explore");
        adapter.AddFragment(new DoneFragment(),"Done");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
