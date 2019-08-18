package com.hemish.tutorialapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by dhame on 6/12/2019.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;
    private String subTitleName;
    private TabDetailsPojoClass mTabDetailsPojoClass;

    public ViewPageAdapter(FragmentManager fm, int numOfTabs, String subTitleName) {
        super(fm);
        this.numOfTabs = numOfTabs;
        this.subTitleName = subTitleName;
        mTabDetailsPojoClass = TabDataProvider.getTutorialInfoByName(subTitleName);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DescriptionFragment descriptionFragment = new DescriptionFragment();
                Bundle bundleMsg = new Bundle();
                bundleMsg.putString("Description", mTabDetailsPojoClass.getTab_Description());
                descriptionFragment.setArguments(bundleMsg);
                return descriptionFragment;
            case 1:
                Bundle bundleMsg1 = new Bundle();
                CodeFragment codeFragment = new CodeFragment();
                bundleMsg1.putString("Code", mTabDetailsPojoClass.getTab_Code());
                codeFragment.setArguments(bundleMsg1);
                return codeFragment;
            case 2:
                Bundle bundleMsg2 = new Bundle();
                OutputFragment outputFragment = new OutputFragment();
                bundleMsg2.putString("Output", mTabDetailsPojoClass.getTab_Output());
                outputFragment.setArguments(bundleMsg2);
                return outputFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }


}
