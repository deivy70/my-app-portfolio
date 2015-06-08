package com.deivy70_gmail.portfolioapp.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button spotifyStreamer;
    Button scoresApp;
    Button libraryApp;
    Button buildItBigger;
    Button xyzReader;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamer = (Button) findViewById(R.id.button_spotify_streamer);
        scoresApp = (Button) findViewById(R.id.button_scores_app);
        libraryApp = (Button) findViewById(R.id.button_library_app);
        buildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        xyzReader = (Button) findViewById(R.id.button_xyz_reader);
        capstone = (Button) findViewById(R.id.button_capstone);

        spotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Spotify Streamer Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        scoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Scores App Button Clicked", Toast.LENGTH_SHORT).show();

            }
        });
        libraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Library App Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Build It Bigger Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        xyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "XYZ Reader Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Capstone Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
