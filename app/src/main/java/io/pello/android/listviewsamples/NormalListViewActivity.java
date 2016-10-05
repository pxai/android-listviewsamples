package io.pello.android.listviewsamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalListViewActivity extends AppCompatActivity {
    private ListView listViewSubjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_list_view);

        setupSimpleList();


    }

    private void setupSimpleList() {
        // Actual data
        String[] data = {"PSP","WEB","ERP","MOV","DI","FOL","AD","EMP","VB","ANA","ENG","ENT","SIS","PROY","FCT"};

        List<String> subjectList = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter listViewAdapter =
                new ArrayAdapter<String>(
                        NormalListViewActivity.this, // Context: this activity
                        R.layout.simple_list_item, // ID of the listView
                        R.id.textViewItem, // ID of the textView insite
                        subjectList);

        ListView listViewSubjects = (ListView) findViewById(R.id.listViewSubjects);

        listViewSubjects.setAdapter(listViewAdapter);


        listViewSubjects.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(NormalListViewActivity.this, "You pressed " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
