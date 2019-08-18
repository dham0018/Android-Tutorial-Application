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
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.LENGTH_LONG;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment{
  private WebView textView;

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_description, container, false);
        textView=view.findViewById(R.id.text);
        textView.getSettings().setJavaScriptEnabled(true);
        textView.getSettings().setBuiltInZoomControls(true);
        Bundle bundle=getArguments();
        String description=bundle.getString("Description");
        textView.loadDataWithBaseURL("file:///android_asset/",description,"text/html","UTF-8",null);
        return view;
    }
}
