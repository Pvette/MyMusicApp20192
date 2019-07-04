package com.example.android.mymusicapp2019;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button jazz;
    private Button pop;
    private Button rock;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jazz = (Button) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link JazzActivity)
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);

                //Start the new activity
                startActivity(jazzIntent);
            }
        });

        pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link PopActivity)
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                //Start the new activity
                startActivity(popIntent);
            }
        });

        rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link PopActivity)
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                //Start the new activity
                startActivity(rockIntent);
            }
        });

    }
}
