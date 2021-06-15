package com.example.eatup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RestaurantAdapter extends BaseAdapter {

    // variable
    Context mContext;
    LayoutInflater inflater;
    List<Restaurants> restaurantsList;
    ArrayList<Restaurants> arrayListRes;

    //Constructor
    public RestaurantAdapter(Context context, List<Restaurants> restaurantsList) {
        this.mContext = context;
        this.restaurantsList = restaurantsList;
        inflater = LayoutInflater.from(mContext);
        this.arrayListRes = new ArrayList<Restaurants>();
        this.arrayListRes.addAll(restaurantsList);

    }

    public class ViewHolder {
        TextView ResName, ResLoc, ResRating;
        ImageView ResPhoto;
    }


    @Override
    public int getCount() {
        return restaurantsList.size();
    }

    @Override
    public Object getItem(int i) {
        return restaurantsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.restaurantslist, null);
            holder.ResName = view.findViewById(R.id.txtRestaurantName);
            holder.ResLoc = view.findViewById(R.id.txtLocation);
            holder.ResRating = view.findViewById(R.id.txtRating);
            holder.ResPhoto = view.findViewById(R.id.imgRestaurant);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.ResName.setText(restaurantsList.get(position).getrRestaurantsName());
        holder.ResLoc.setText(restaurantsList.get(position).getrLocation());
        holder.ResRating.setText(restaurantsList.get(position).getrRatings());
        holder.ResPhoto.setImageResource(restaurantsList.get(position).getrImageResouseId());


        return view;
    }


    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        restaurantsList.clear();
        if (charText.length() == 0) {
            restaurantsList.addAll(arrayListRes);
        } else {
            for (Restaurants res : arrayListRes) {
                if (res.getrRestaurantsName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    restaurantsList.add(res);
                }
            }
        }
        notifyDataSetChanged();
    }
}
