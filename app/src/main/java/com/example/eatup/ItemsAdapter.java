
package com.example.eatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends ArrayAdapter<Items> {
    public ItemsAdapter(Context context, ArrayList<Items> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Items item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items_row_list, parent, false);
        }
        // Lookup view for data population
        TextView itemprice = (TextView) convertView.findViewById(R.id.txtItemPrice);
        TextView itemname = (TextView) convertView.findViewById(R.id.txtItemName);
        // Populate the data into the template view using the data object
        itemname.setText(item.getItemName());
        itemprice.setText(item.getItemPrice());
        // Return the completed view to render on screen
        return convertView;
    }
}