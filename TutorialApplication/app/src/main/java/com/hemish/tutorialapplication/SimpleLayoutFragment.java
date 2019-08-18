package com.hemish.tutorialapplication;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleLayoutFragment extends Fragment {
    private WebView mSimpleTextView;
    private TabDetailsPojoClass mTabDetailsPojoClass;
    private String subTitleName;

    public SimpleLayoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_simple_layout, container, false);
        mSimpleTextView = view.findViewById(R.id.txtDescription1);
        mSimpleTextView.getSettings().setJavaScriptEnabled(true);
        mSimpleTextView.getSettings().setBuiltInZoomControls(true);
        Bundle bundle = getArguments();
        subTitleName = bundle.getString("subTitleName");
        mTabDetailsPojoClass = TabDataProvider.getTutorialInfoByName(subTitleName);
        mSimpleTextView.loadDataWithBaseURL("file:///android_asset/",mTabDetailsPojoClass.getTab_Description(),"text/html","UTF-8",null);

        return view;
    }

}
