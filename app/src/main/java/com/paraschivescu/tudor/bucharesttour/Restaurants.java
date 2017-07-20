package com.paraschivescu.tudor.bucharesttour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    private ArrayList<Location> restaurants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        // Populate the array with the locations
        restaurants.add(new Location(
                R.drawable.restaurants_hanu_lui_manuc,
                R.string.restaurants_hanu_lui_manuc,
                R.string.address_hanu_lui_manuc,
                R.string.website_hanu_lui_manuc));
        restaurants.add(new Location(
                R.drawable.restaurants_hanu_berarilor,
                R.string.restaurants_hanu_berarilor,
                R.string.address_hanu_berarilor,
                R.string.website_hanu_berarilor));
        restaurants.add(new Location(
                R.drawable.restaurants_stadio,
                R.string.restaurants_stadio,
                R.string.address_stadio,
                R.string.website_stadio));
        restaurants.add(new Location(
                R.drawable.restaurants_upstairs,
                R.string.restaurants_upstairs_rooftop,
                R.string.address_upstairs_rooftop,
                R.string.website_upstairs_rooftop));
        restaurants.add(new Location(
                R.drawable.restaurants_vivo,
                R.string.restaurants_vivo,
                R.string.address_vivo,
                R.string.website_vivo));
        restaurants.add(new Location(
                R.drawable.restaurants_hard_rock_cafe,
                R.string.restaurants_hard_rock_cafe,
                R.string.address_hard_rock_cafe,
                R.string.website_hard_rock_cafe));

        // Adapter for the populated array list
        LocationAdapter locationAdapter = new LocationAdapter(this, restaurants);

        // Set the adapter to the list view
        ListView listView = (ListView) findViewById(R.id.list_restaurants);
        listView.setAdapter(locationAdapter);
    }
}
