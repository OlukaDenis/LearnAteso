package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {


    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ateso_english_list, container, false);

        //creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("White", "ekwang"));
        words.add(new Word("Black", "iryono"));
        words.add(new Word("Green", "lopiria"));
        words.add(new Word("Brown", "...."));
        words.add(new Word("Yellow", "lodos"));
        words.add(new Word("Red", "loarengan"));
        words.add(new Word("Gray", "...."));
        words.add(new Word("Violet", "....."));
        words.add(new Word("Magenta", "....."));
        words.add(new Word("Pink", "...."));


        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

        return rootView;
    }

}
