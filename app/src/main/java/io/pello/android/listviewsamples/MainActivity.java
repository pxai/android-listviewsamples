package io.pello.android.listviewsamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * opens Activity with simple ListView
     * @param view
     */
    public void openNormalListView (View view) {
        Intent intent = new Intent(MainActivity.this, NormalListViewActivity.class);
        startActivity(intent);
    }

    /**
     * opens activity with customized listView
     * @param view
     */
    public void openCustomListView (View view) {
        Intent intent = new Intent(MainActivity.this, CustomListViewActivity.class);
        startActivity(intent);
    }
}
