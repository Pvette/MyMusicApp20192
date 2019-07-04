package com.example.android.mymusicapp2019;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        //Create an array of rock albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Western Stars","Bruce Springsteen"));
        albums.add(new Album("All Time Greatest Hits","Lynyrd Skynyrd"));
        albums.add(new Album("The Definitive Rod Stewart", "Rod Stewart"));
        albums.add(new Album("Hysteria", "Def Leppard"));
        albums.add(new Album("ATTENTION ATTENTION", "Shinedown"));



        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView albumView = new TextView(this);

    }
}
