package com.example.rma_user.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        CheckBox checkBoxDone;

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.list_item2, parent, false);
            checkBoxDone = (CheckBox) convertView.findViewById(R.id.checkBoxDone);
            checkBoxDone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    data.get((Integer) buttonView.getTag()).setStatus(isChecked);
                }
            });
        }


        TextView textViewItemName = (TextView) convertView.findViewById(R.id.textViewItemName);
        checkBoxDone = (CheckBox) convertView.findViewById(R.id.checkBoxDone);
        TextView textViewDateTime = (TextView) convertView.findViewById(R.id.textViewDateTime);

        textViewItemName.setText(data.get(position).getItem());
        checkBoxDone.setTag(position);
        checkBoxDone.setChecked(data.get(position).isStatus());
        textViewDateTime.setText(data.get(position).getDate() + " " + data.get(position).getTime());


        return convertView;
    }

    public void clear(){
        data.clear();
        notifyDataSetChanged();
    }
}
