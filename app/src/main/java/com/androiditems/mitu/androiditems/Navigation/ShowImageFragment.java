package com.androiditems.mitu.androiditems.Navigation;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androiditems.mitu.androiditems.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowImageFragment extends Fragment {


    public ShowImageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show_image, container, false);

        return view;
    }


}
