package com.hemish.tutorialapplication;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.net.URISyntaxException;
import java.util.HashMap;

public class TabFragment extends Fragment{
  private Toolbar toolbar;
  private ViewPager viewPager;
  private ViewPageAdapter viewPageAdapter;
  private TabLayout tabLayout;
  TabItem tabDescription,tabCode,tabOutput;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.activity_tab, container, false);

//        toolbar=view.findViewById(R.id.toolbar);
//        toolbar.setTitle("Description");
        tabLayout=view.findViewById(R.id.tabs);

        viewPager=view.findViewById(R.id.pager);
       Bundle bundle=getArguments();
       String subTitleName=bundle.getString("subTitleName");

        viewPager.setAdapter(new ViewPageAdapter(getChildFragmentManager(),tabLayout.getTabCount(), subTitleName));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
     return view;
    }
}
