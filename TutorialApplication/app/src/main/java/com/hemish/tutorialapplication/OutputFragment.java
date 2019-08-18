package com.hemish.tutorialapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class OutputFragment extends Fragment {
private WebView imgView;

    public OutputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_output, container, false);
        imgView=view.findViewById(R.id.img);
        imgView.getSettings().setJavaScriptEnabled(true);
        imgView.getSettings().setBuiltInZoomControls(true);
        Bundle bundle=getArguments();
        String output=bundle.getString("Output");
        imgView.loadDataWithBaseURL("file:///android_asset/output/",output,"text/html","UTF-8",null);
        return view;
    }

}
