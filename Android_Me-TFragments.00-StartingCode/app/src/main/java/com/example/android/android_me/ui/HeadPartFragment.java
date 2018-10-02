package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class HeadPartFragment extends Fragment {

    public HeadPartFragment(){

    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_head_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.head_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}
