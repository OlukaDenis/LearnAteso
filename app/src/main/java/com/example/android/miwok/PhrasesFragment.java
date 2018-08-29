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
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ateso_english_list, container, false);

        //creating an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?", "ngaibo ekon kiror?"));
        words.add(new Word("Where are you going?", "aibo ilosi jo?"));
        words.add(new Word("I am feeling good", "apupi eong ejok"));
        words.add(new Word("Are you coming?", "ibunit jo?"));
        words.add(new Word("My name is...", "ekakiror...."));
        words.add(new Word("Yes, I'm coming", "Ebo, abunit eong"));
        words.add(new Word("Let's go", "kaloto"));
        words.add(new Word("Come here", "obia ne"));
        words.add(new Word("What are you doing?", "inyobo iswamai jo"));
        words.add(new Word("How old are you?", "ikon ikaru imwasai?"));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

        return rootView;
    }

}
