package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    ArrayList<Words> words;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //LinearLayout rootview=(LinearLayout)findViewById(R.id.rootview);
        // we will add textview by java code

       /* int index=0;
        while(index<words.size())
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            // add text view to linealayout
            // on screen will appear the first element in list of words we reapeat this steps and add rest of the words list elment
            rootview.addView(wordView);
            index++;
        }*/
        // for loop  another methood
       /* for(int Index=0;Index<words.size();Index++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(Index));
            // add text view to linealayout
            // on screen will appear the first element in list of words we reapeat this steps and add rest of the words list elment
            rootview.addView(wordView);

        }*/
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The

        // adapter knows how to create layouts for each item in the list, using the

        // simple_list_item_1.xml layout resource defined in the Android framework.

        // This list item layout contains a single {@link TextView}, which the adapter will set to

        // display a single word.
            /* ArrayAdapter<Words> itemsAdapter =
                new ArrayAdapter<Words>(this, android.R.layout.simple_list_item_1, words);
                */
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.

        // There should be a {@link ListView} with the view ID called list, which is declared in the

        // activity_numbers.xml layout file.
        // make cutsom adpter
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the

        // {@link ListView} will display list items for each word in the list of words.

        // Do this by calling the setAdapter method on the {@link ListView} object and pass in

        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);
    }
    public void listOfWords()
    {
        // Create a list of words
        words = new ArrayList<Words>();

        words.add(new Words("one", "lutti",R.drawable.number_one));

        words.add(new Words("two", "otiiko",R.drawable.number_two));

        words.add(new Words("three", "tolookosu",R.drawable.number_three));

        words.add(new Words("four", "oyyisa",R.drawable.number_four));

        words.add(new Words("five", "massokka",R.drawable.number_five));

        words.add(new Words("six", "temmokka",R.drawable.number_six));

        words.add(new Words("seven", "kenekaku",R.drawable.number_seven));

        words.add(new Words("eight", "kawinta",R.drawable.number_eight));

        words.add(new Words("nine", "wo’e",R.drawable.number_nine));

        words.add(new Words("ten", "na’aacha",R.drawable.number_ten));


    }
}
