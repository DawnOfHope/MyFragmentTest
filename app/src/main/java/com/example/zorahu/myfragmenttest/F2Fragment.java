package com.example.zorahu.myfragmenttest;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F2Fragment extends Fragment {
    private TextView tv;

    public F2Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_f2_fragment, container, false);
        tv = (TextView)view.findViewById(R.id.f2_tv);
        tv.setText("Hello, TV2");
        return view;
    }
}
