package com.example.android.miwok;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumberFragment extends Fragment {
    MediaPlayer mMediaplayer;
    public ListView listView;


    public NumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ateso_english_list, container, false);

        //creating an array of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "idopet", R.drawable.one, R.raw.one));
        words.add(new Word("Two", "iyarei",R.drawable.two, R.raw.two));
        words.add(new Word("Three", "iwuni", R.drawable.three, R.raw.three));
        words.add(new Word("Four", "iwongon", R.drawable.four , R.raw.four));
        words.add(new Word("Five", "ikany", R.drawable.five, R.raw.five));
        words.add(new Word("Six", "ikanyapei",  R.drawable.six, R.raw.six));
        words.add(new Word("Seven", "inkanyarei", R.drawable.seven, R.raw.six));
        words.add(new Word("Eight", "inkanyauni", R.drawable.eight, R.raw.seven));
        words.add(new Word("Nine", "inkanyangon", R.drawable.nine, R.raw.eight));
        words.add(new Word("Ten", "itomon",  R.drawable.ten, R.raw.nine));
        words.add(new Word("Eleven", "itomonadiop",  R.drawable.ten, R.raw.ten));
        words.add(new Word("Twelve", "itomonaarei", R.drawable.one, R.raw.one));
        words.add(new Word("Thirteen", "itomonawuni",R.drawable.two, R.raw.two));
        words.add(new Word("Fourteen", "itomonawongon", R.drawable.three, R.raw.three));
        words.add(new Word("Fifteen", "itomonakany", R.drawable.four , R.raw.four));
        words.add(new Word("Sixteen", "itomonakanyapei", R.drawable.five, R.raw.five));
        words.add(new Word("Seventeen", "itomonakanyarei",  R.drawable.six, R.raw.six));
        words.add(new Word("Eighteen", "itomonakanyauni", R.drawable.seven, R.raw.six));
        words.add(new Word("Nineteen", "itomonakanyangon", R.drawable.eight, R.raw.seven));
        words.add(new Word("Twenty", "akeisarei", R.drawable.nine, R.raw.eight));
        words.add(new Word("Twenty one", "akeisareidiop",  R.drawable.ten, R.raw.nine));
        words.add(new Word("Twenty two", "akaeisareiyarei",  R.drawable.ten, R.raw.ten));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        listView = (ListView) rootView.findViewById(R.id.list);

        //this method is called inorder to display items in a list
        listView.setAdapter(wordAdapter);
        //sets a listener to play an audio when a list item is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mMediaplayer = MediaPlayer.create(getActivity(), words.get(position).getImageResourceID());
                mMediaplayer.start();
            }
        });
        return rootView;
    }

}
