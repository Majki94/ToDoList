package com.example.rma_user.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class ListActivity extends AppCompatActivity {

    String[] data = new String[]{"green", "blue", "red"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, R.layout.list_item, data);

        Item item = new Item("item1", true, "21.11.2016", "13:25"):
        Item item2 = new Item("item2", false, "22.11.2016", "13:26"):

        List<Item> list = new ArrayList<Item>();
        list.add(item);
        list.add(item2);

        listView.setAdapter(adapter);
    }
}
