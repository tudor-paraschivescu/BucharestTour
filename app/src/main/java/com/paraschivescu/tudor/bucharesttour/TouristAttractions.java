package com.paraschivescu.tudor.bucharesttour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristAttractions extends AppCompatActivity {

    private ArrayList<Location> touristAttractions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_attractions);

        // Populate the array with the locations
        touristAttractions.add(new Location(
                R.drawable.touristic_attractions_palace_of_parliament,
                R.string.touristic_attractions_palace_of_parliament,
                R.string.address_palace_of_parliament,
                R.string.website_palace_of_parliament));
        touristAttractions.add(new Location(
                R.drawable.touristic_attractions_romanian_athenaeum,
                R.string.touristic_attractions_romanian_athenaeum,
                R.string.address_romanian_athenaeum,
                R.string.website_romanian_athenaeum));
        touristAttractions.add(new Location(
                R.drawable.touristic_attractions_triumph_arch,
                R.string.touristic_attractions_triumph_arch,
                R.string.address_triumph_arch,
                R.string.website_triumph_arch));
        touristAttractions.add(new Location(
                R.drawable.touristic_attractions_grigore_antipa_national_museum,
                R.string.touristic_attractions_grigore_antipa_national_museum,
                R.string.address_grigore_antipa_national_museum,
                R.string.website_grigore_antipa_national_museum));
        touristAttractions.add(new Location(
                R.drawable.touristic_attractions_coltea_hospital,
                R.string.touristic_attractions_coltea_hospital,
                R.string.address_coltea_hospital,
                R.string.website_coltea_hospital));

        LocationAdapter locationAdapter = new LocationAdapter(this, touristAttractions);

        ListView listView = (ListView) findViewById(R.id.list_tourist_attractions);
        listView.setAdapter(locationAdapter);
    }
}
