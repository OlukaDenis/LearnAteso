package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ateso_english_list, container, false);

        //creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "papa"));
        words.add(new Word("Mother", "toto"));
        words.add(new Word("Uncle", "mamai"));
        words.add(new Word("Auntie", "ija"));
        words.add(new Word("Son", "okooka"));
        words.add(new Word("Daughter", "akooka"));
        words.add(new Word("Sister", "inac"));
        words.add(new Word("Brother", "onac"));
        words.add(new Word("Grand mother", "tata"));
        words.add(new Word("Grand father", "papa"));
        words.add(new Word("In-law", "amuran"));
        words.add(new Word("Grand child", "itatait"));
        words.add(new Word("Grand grand child", "ijejait"));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

        return rootView;
    }

}
