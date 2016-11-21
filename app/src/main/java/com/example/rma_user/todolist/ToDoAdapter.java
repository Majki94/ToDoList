package com.example.rma_user.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rma-user on 11/21/16.
 */

public class ToDoAdapter extends BaseAdapter {

    List<Item> data;

    public ToDoAdapter(List<Item> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.list_item2, parent, false);
        }

        TextView textViewItemName = (TextView) convertView.findViewById(R.id.textViewItemName);
        CheckBox done = (CheckBox) convertView.findViewById(R.id.checkBoxDone);
        TextView textViewDateTime = (TextView) convertView.findViewById(R.id.textViewDateAndTime);

        textViewItemName.setText(data.get(position).getItem());
        done.setChecked(data.get(position).isStatus());
        textViewDateTime.setText(data.get(position).getDate() + " " + data.get(position).getTime());



        return convertView;
    }
}
