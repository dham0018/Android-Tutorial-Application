package com.hemish.tutorialapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;


/**
 * A simple {@link Fragment} subclass.
 */
public class CodeFragment extends Fragment {
    private WebView textView;

    public CodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_code, container, false);
        textView=view.findViewById(R.id.text);
        textView.getSettings().setJavaScriptEnabled(true);
        textView.getSettings().setBuiltInZoomControls(true);
        Bundle bundle=getArguments();
        String code=bundle.getString("Code");
        textView.loadDataWithBaseURL("file:///android_asset/",code,"text/html","UTF-8",null);

       return view;
    }

}
