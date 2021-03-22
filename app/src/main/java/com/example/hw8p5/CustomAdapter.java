package com.example.hw8p5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class CustomAdapter extends ArrayAdapter<WeatherData> {


    public CustomAdapter(Context application, ArrayList<WeatherData> data) {
        super(application, 0, data);
        System.out.println("constructor");

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("adding to list");
        WeatherData d = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.anctivity_listview, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        TextView time = convertView.findViewById(R.id.time);
        TextView temp = convertView.findViewById(R.id.temp);
        TextView feels = convertView.findViewById(R.id.feels);
        TextView wind = convertView.findViewById(R.id.wind);
        TextView humid = convertView.findViewById(R.id.humid);
        System.out.println("added list");

        Date t = new Date(d.getTimeLong()*1000);

        name.setText(d.getCityName());
        time.setText("Date: " + t);
        temp.setText(d.getTemp());
        feels.setText(d.getFeelsLike());
        wind.setText(d.getWind());
        humid.setText(d.getHumid());
        System.out.println("added list");


        return convertView;
    }
}
