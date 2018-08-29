package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;


/**
 * Created by McDenny Lucaz on 6/16/2018.
 */

//This is a custom ArrayAdapter that can provide layout of the list view based on the data source
public class WordAdapter extends ArrayAdapter<Word> {
    //private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    //Resourcee ID for the background color of the list or words
    private int mColorResourceId;
    private ArrayList<Word> displayList;
    private Context context;
    LayoutInflater inflater;

    public WordAdapter(Activity context, ArrayList<Word> listWords, int colorResourceId){
        super(context, 0, listWords);
        mColorResourceId = colorResourceId;
        this.displayList = listWords;
        this.context = context;
        this.mColorResourceId = colorResourceId;
        inflater = LayoutInflater.from(context);
    }

    private static class WordHolder {
        TextView atesotxt;
        TextView englishtxt;
        ImageView wordimage;
    }

    @Override
    public int getCount() {
        return displayList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    /**
     *
     * @param position The adapter position that is requesting for the view
     * @param counterView The view to populate the view
     * @param parent The parent view that is used for inflation
     * @return The view for the position  in the AdapterView
     */
    @Override
    public View getView(int position, View counterView, ViewGroup parent){
        //gets the @Word object located at this position  in the list
        Word currentWord = getItem(position);
        WordHolder holder;

        //checks  whether the existing view is being reused, if not it is inflated
        View listItemView = counterView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);

            holder = new WordHolder();
            holder.atesotxt = (TextView) listItemView.findViewById(R.id.ateso_text_view);
            holder.englishtxt = (TextView) listItemView.findViewById(R.id.english_text_view);
            holder.wordimage = (ImageView) listItemView.findViewById(R.id.word_image);


            listItemView.setTag(holder);

        }
        else {
            holder = (WordHolder) listItemView.getTag();
        }
        holder.atesotxt.setText(displayList.get(position).getAtesoTranslation());
        holder.englishtxt.setText(displayList.get(position).getEnglishTranslation());
        if(currentWord.hasImage()){
            //set the image to the image resource specified in the current word
            holder.wordimage.setImageResource(currentWord.getImageResourceID());
            holder.wordimage.setVisibility(View.VISIBLE);
        }
        else {
            //other wise hide the image
            holder.wordimage.setVisibility(View.GONE);
        }

        //set theme color for the  list view
        View textContainer = listItemView.findViewById(R.id.text_container);

        //find the  color that maps to the resourceID
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //set color to the background of the text container
        textContainer.setBackgroundColor(color);

        //return the whole list layout (containing two layouts)
        return listItemView;
    }
}
