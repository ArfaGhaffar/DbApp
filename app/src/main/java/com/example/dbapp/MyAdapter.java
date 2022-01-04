package com.example.dbapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class MyAdapter extends ArrayAdapter<String> {

    Context context;
    String rTitle[];
    String rDescription[];


    MyAdapter (Context c, String title[], String description[]) {
        super(c, R.layout.item_list, R.id.textView1, title);
        this.context = c;
        this.rTitle = title;
        this.rDescription = description;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.item_list, parent, false);
        TextView myTitle = row.findViewById(R.id.textView1);
        TextView myDescription = row.findViewById(R.id.textView2);

        // now set our resources on views
        myTitle.setText(rTitle[position]);
        myDescription.setText(rDescription[position]);




        return row;
    }
}