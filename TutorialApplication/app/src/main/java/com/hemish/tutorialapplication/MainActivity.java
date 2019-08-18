package com.hemish.tutorialapplication;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   private DrawerLayout mDrawerLayout;
   private FragmentManager mFragmentManager;
   private FragmentTransaction mFragmentTransaction;
   private Toolbar toolbar;
   private ActionBarDrawerToggle mDrawerToggle;
    private ExpandableListView mlistView;
     private List<String> mListDataHeader;
     private HashMap<String, List<String>> mListHashMap;
    private TabDetailsPojoClass mTabDetailsPojoClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabDataProvider.setTutorialInfo();
        mlistView=(ExpandableListView) findViewById(R.id.indexElv);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);


        mFragmentManager=getSupportFragmentManager();
        mFragmentTransaction=mFragmentManager.beginTransaction();
        final SimpleLayoutFragment simpleLayoutFragment=new SimpleLayoutFragment();
        Bundle homeMsg=new Bundle();
        homeMsg.putString("subTitleName","Home");
        simpleLayoutFragment.setArguments(homeMsg);
        mFragmentTransaction.replace(R.id.containerView,simpleLayoutFragment ).commit();

        tutorialData();
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDrawerToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.drawer_open,R.string.drawer_close);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mlistView.setAdapter(new CustomExpandableListAdapter(this, mListDataHeader, mListHashMap));

        mlistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                 //Toast.makeText(getApplicationContext(),mListHashMap.get(mListDataHeader.get(groupPosition)).get(childPosition),Toast.LENGTH_LONG).show();
              toolbar.setTitle(mListHashMap.get(mListDataHeader.get(groupPosition)).get(childPosition));
                if(mListDataHeader.get(groupPosition).equals("Android Basics")||mListDataHeader.get(groupPosition).equals("Android Intent")||mListHashMap.get(mListDataHeader.get(groupPosition)).get(childPosition).equals("Android View and View Group")){

                   mFragmentTransaction=mFragmentManager.beginTransaction();
                   Bundle simpleMsg=new Bundle();
                   SimpleLayoutFragment sl=new SimpleLayoutFragment();
                   simpleMsg.putString("subTitleName",mListHashMap.get(mListDataHeader.get(groupPosition)).get(childPosition));
                   sl.setArguments(simpleMsg);
                   mFragmentTransaction.replace(R.id.containerView,sl).commit();

               }else{

                   mFragmentTransaction=mFragmentManager.beginTransaction();
                   TabFragment tabFragment=new TabFragment();
                   Bundle b=new Bundle();
                   b.putString("subTitleName",mListHashMap.get(mListDataHeader.get(groupPosition)).get(childPosition));
                   tabFragment.setArguments(b);
                   mFragmentTransaction.replace(R.id.containerView, tabFragment).commit();
               }
               mDrawerLayout.closeDrawer(GravityCompat.START);
                return false;
            }
        });



    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu,menu);
//        return true;
//    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(mDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void tutorialData() {

        mListDataHeader=new ArrayList<>();
        mListHashMap=new HashMap<>();

        mListDataHeader.addAll(Arrays.asList(getResources().getStringArray(R.array.tutorial_data_title_list)));

        mListHashMap.put(mListDataHeader.get(0), Arrays.asList(getResources().getStringArray(R.array.android_basics)));
        mListHashMap.put(mListDataHeader.get(1),Arrays.asList(getResources().getStringArray(R.array.android_fragments)));
        mListHashMap.put(mListDataHeader.get(2),Arrays.asList(getResources().getStringArray(R.array.android_intent)));
        mListHashMap.put(mListDataHeader.get(3),Arrays.asList(getResources().getStringArray(R.array.android_layouts)));
        mListHashMap.put(mListDataHeader.get(4),Arrays.asList(getResources().getStringArray(R.array.android_widgets)));
        mListHashMap.put(mListDataHeader.get(5),Arrays.asList(getResources().getStringArray(R.array.android_menu)));
        mListHashMap.put(mListDataHeader.get(6),Arrays.asList(getResources().getStringArray(R.array.android_notifications)));
        mListHashMap.put(mListDataHeader.get(7),Arrays.asList(getResources().getStringArray(R.array.android_storage)));
//        mListHashMap.put(mListDataHeader.get(5),Arrays.asList(getResources().getStringArray(R.array.android_menu)));
//        mListHashMap.put(mListDataHeader.get(6),Arrays.asList(getResources().getStringArray(R.array.android_service)));
//        mListHashMap.put(mListDataHeader.get(7),Arrays.asList(getResources().getStringArray(R.array.android_alarm_manager)));
//        mListHashMap.put(mListDataHeader.get(9),Arrays.asList(getResources().getStringArray(R.array.android_sqlite)));
//        mListHashMap.put(mListDataHeader.get(10),Arrays.asList(getResources().getStringArray(R.array.xml_json)));
//        mListHashMap.put(mListDataHeader.get(11),Arrays.asList(getResources().getStringArray(R.array.android_multimedia)));
//        mListHashMap.put(mListDataHeader.get(12),Arrays.asList(getResources().getStringArray(R.array.android_speech)));
//        mListHashMap.put(mListDataHeader.get(13),Arrays.asList(getResources().getStringArray(R.array.android_telephony)));
//        mListHashMap.put(mListDataHeader.get(14),Arrays.asList(getResources().getStringArray(R.array.android_device)));
//        mListHashMap.put(mListDataHeader.get(15),Arrays.asList(getResources().getStringArray(R.array.camera_tutorial)));
//        mListHashMap.put(mListDataHeader.get(16),Arrays.asList(getResources().getStringArray(R.array.sensor_tutorial)));
//        mListHashMap.put(mListDataHeader.get(17),Arrays.asList(getResources().getStringArray(R.array.android_graphics)));
//        mListHashMap.put(mListDataHeader.get(18),Arrays.asList(getResources().getStringArray(R.array.android_animation)));
//        mListHashMap.put(mListDataHeader.get(19),Arrays.asList(getResources().getStringArray(R.array.android_web_service)));
//        mListHashMap.put(mListDataHeader.get(20),Arrays.asList(getResources().getStringArray(R.array.google_map)));
//        mListHashMap.put(mListDataHeader.get(21),Arrays.asList(getResources().getStringArray(R.array.adding_advertisements)));
//        mListHashMap.put(mListDataHeader.get(22),Arrays.asList(getResources().getStringArray(R.array.android_social)));
//        mListHashMap.put(mListDataHeader.get(23),Arrays.asList(getResources().getStringArray(R.array.android_examples)));
    }


}
