package org.girldevelopit.gdihackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ArrayList<String> myList = new ArrayList<>();
        myList.add("Jellybean");
        myList.add("KitKat");
        myList.add("lollipop");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.sample_my_view, myList);
        ListView listView = findViewById(R.id.mylistview);
        listView.setAdapter(arrayAdapter);
    }
}
