package com.paraschivescu.tudor.bucharesttour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PubsBars extends AppCompatActivity {

    private ArrayList<Location> pubsBars = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubs_bars);

        // Populate the array with the locations
        pubsBars.add(new Location(
                R.drawable.pubs_bars_fire_club,
                R.string.pubs_bars_fire_club,
                R.string.address_fire_club,
                R.string.website_fire_club));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_bounce,
                R.string.pubs_bars_bounce,
                R.string.address_bounce,
                R.string.website_bounce));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_silver_church,
                R.string.pubs_bars_silver_church,
                R.string.address_silver_church,
                R.string.website_silver_church));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_the_vintage,
                R.string.pubs_bars_the_vintage,
                R.string.address_the_vintage,
                R.string.website_the_vintage));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_skybar,
                R.string.pubs_bars_skybar,
                R.string.address_skybar,
                R.string.website_skybar));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_vinexpert,
                R.string.pubs_bars_vinexpert,
                R.string.address_vinexpert,
                R.string.website_vinexpert));
        pubsBars.add(new Location(
                R.drawable.pubs_bars_nomad,
                R.string.pubs_bars_nomad,
                R.string.address_nomad,
                R.string.website_nomad));

        // Adapter for the populated array list
        LocationAdapter locationAdapter = new LocationAdapter(this, pubsBars);

        // Set the adapter to the list view
        ListView listView = (ListView) findViewById(R.id.list_pubs_bars);
        listView.setAdapter(locationAdapter);
    }
}
