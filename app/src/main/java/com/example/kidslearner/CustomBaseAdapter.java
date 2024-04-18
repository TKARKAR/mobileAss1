package com.example.kidslearner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context ct;
    String fruitList[];
    int imagesList[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ct,String[] fruitList,int[] images){
    this.ct=ct;
    this.fruitList=fruitList;
    this.imagesList=images;
    inflater=LayoutInflater.from(ct);
    }

    @Override
    public int getCount() {
        return fruitList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_fruits_list_view,null);
        TextView textView=(TextView) convertView.findViewById(R.id.textView);
        ImageView fruitImage=(ImageView)convertView.findViewById(R.id.imageIcon);
        textView.setText(fruitList[position]);
        fruitImage.setImageResource(imagesList[position]);
        return convertView;
    }
}
