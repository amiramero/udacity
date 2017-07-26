package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by amiraelsayed on 7/20/2017.
 */

public class WordAdapter extends ArrayAdapter<Words>
{
    public WordAdapter(Context context, ArrayList<Words> pWords)
    {
        super(context,0, pWords);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_listitem, parent, false);
        }
        Words local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(local_word.getMiwok());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(local_word.getDefaultranslate());
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        // Set the ImageView to the image resource specified in the current Word

        imageView.setImageResource(local_word.getImageId());
        // Check if an image is provided for this word or not

        if (local_word.hasImage()) {

            // If an image is available, display the provided image based on the resource ID

            imageView.setImageResource(local_word.getImageId());

            // Make sure the view is visible

            imageView.setVisibility(View.VISIBLE);

        } else {

            // Otherwise hide the ImageView (set visibility to GONE)

            imageView.setVisibility(View.GONE);

        }



        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in

        // the ListView.
        return listItemView;

    }
}
