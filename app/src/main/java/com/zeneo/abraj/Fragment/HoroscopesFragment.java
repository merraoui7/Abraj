package com.zeneo.abraj.Fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeneo.abraj.Adapter.ViewPagerAdapter;
import com.zeneo.abraj.R;
import com.zeneo.abraj.View.CustomViewPager;

/**
 * A simple {@link Fragment} subclass.
 */
public class HoroscopesFragment extends Fragment {


    public HoroscopesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_horoscopes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewPager(view);
    }

    void setupViewPager (View view){


        CustomViewPager pager = view.findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFrag("اليوم",HoroscopesTextFragment.newInstance(""));
        adapter.addFrag("الغد",HoroscopesTextFragment.newInstance(""));
        adapter.addFrag("هذا الاسبوع",HoroscopesTextFragment.newInstance(""));
        adapter.addFrag("هذا الشهر",HoroscopesTextFragment.newInstance(""));

        pager.setAdapter(adapter);

        TabLayout tabLayout = view.findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(pager);

    }

}
