package com.example.zsy.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by ZSY on 2017/4/17.
 */

public class PoemAdapter extends ArrayAdapter<Poem> {
    private int resourceId;

    public PoemAdapter(Context context, int textViewResourceId, List<Poem> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Poem poem = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.poemImage=(ImageView)view.findViewById(R.id.poem_image);
            viewHolder.poemName=(TextView)view.findViewById(R.id.poem_name);
            view.setTag(viewHolder);
        }
        else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.poemImage.setImageResource(poem.getImageId());
        viewHolder.poemName.setText(poem.getName());
        return view;
    }

    class ViewHolder{
        ImageView poemImage;
        TextView poemName;
    }

}
