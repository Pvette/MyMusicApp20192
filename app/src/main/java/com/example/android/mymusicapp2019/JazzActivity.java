package com.example.android.mymusicapp2019;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);



        //Create an array of albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Blue Train", "John Coltrane"));
        albums.add(new Album("The Sidewinder", "Lee Morgan"));
        albums.add(new Album("The Turnaround!", "Hank Mobley"));
        albums.add(new Album("Be Good", "Gregory Porter"));
        albums.add(new Album("Moanin", "Art Blakely"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView wordView = new TextView(this);



     //   Toolbar toolbar = findViewById(R.id.toolbar);
    //    setSupportActionBar(toolbar);
    //    getSupportActionBar().setTitle("Back to Main");
    //    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
