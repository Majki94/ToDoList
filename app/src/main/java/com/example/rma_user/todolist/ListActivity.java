package com.example.rma_user.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    String[] data = new String[]{"green", "blue", "red"};
    ToDoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, R.layout.list_item, data);

        Item item = new Item("item1", true, "21.11.2016", "13:25");
        Item item2 = new Item("item2", false, "22.11.2016", "13:26");

        List<Item> list = new ArrayList<Item>();
        list.add(item);
        list.add(item2);

        adapter = new ToDoAdapter(list);

        listView.setAdapter(adapter);


    }

    @Override
    protected void onStop() {
        super.onStop();
        for (int i=0; i<adapter.getCount(); i++){
            System.out.println(((Item)adapter.getItem(i)).isStatus());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                return true;
            case R.id.delete:
                adapter.clear();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
