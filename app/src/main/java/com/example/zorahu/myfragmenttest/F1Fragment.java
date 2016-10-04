package com.example.zorahu.myfragmenttest;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F1Fragment extends Fragment {
    private TextView tv;
    private MainActivity main;

    public F1Fragment() {
        // Required empty public constructor
        main = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_f1_fragment, container, false);
        tv = (TextView) view.findViewById(R.id.f1_tv);
        tv.setText("Hello, TV1");
        return view;
    }
}
