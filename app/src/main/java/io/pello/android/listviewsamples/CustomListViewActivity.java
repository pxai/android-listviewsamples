package io.pello.android.listviewsamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CustomListViewActivity extends AppCompatActivity {
    private ListView listViewTasks;
    private ArrayList<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        setupData();
        setupCustomList();
    }

    /**
     * sets up an ArrayList of Tasks
     */
    private void setupData () {
        tasks = new ArrayList<Task>();
        tasks.add(new Task(1,"Study ANDROID","I should study more for Android",1));
        tasks.add(new Task(3,"Study ERPS","I should study much more for ERPS",3));
        tasks.add(new Task(4,"Practice Sports","I should practice real sports",2));
        tasks.add(new Task(6,"Eat fruits","I should eat more fruits, not jelly beans",1));
        tasks.add(new Task(8,"Ban Red Bull","I should stop drinking Red Bull",2));
        tasks.add(new Task(6,"Mix Vodka","I should stop mixing Vodka with Red Bull",1));
    }

    /**
     * sets up the customized list
     */
    private void setupCustomList() {

        CustomizedListAdapter customizedListAdapter = new CustomizedListAdapter(this, tasks);

        listViewTasks = (ListView) findViewById(R.id.listViewTasks);

        listViewTasks.setAdapter(customizedListAdapter);


        listViewTasks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(CustomListViewActivity.this, "You pressed " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}