package com.paraschivescu.tudor.bucharesttour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CoffeeTea extends AppCompatActivity {

    private ArrayList<Location> coffeeTea = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_tea);

        // Populate the array with the locations
        coffeeTea.add(new Location(
                R.drawable.coffee_tea_manufaktura,
                R.string.coffee_tea_manufaktura_by_doncafe,
                R.string.address_manufaktura_by_doncafe,
                R.string.website_manufaktura_by_doncafe));
        coffeeTea.add(new Location(
                R.drawable.coffee_tea_frudisiac,
                R.string.coffee_tea_frudisiac,
                R.string.address_frudisiac,
                R.string.website_frudisiac));
        coffeeTea.add(new Location(
                R.drawable.coffee_tea_coffeol,
                R.string.coffee_tea_coffeol_romania,
                R.string.address_coffeol_romania,
                R.string.website_coffeol_romania));
        coffeeTea.add(new Location(
                R.drawable.coffee_tea_meron,
                R.string.coffee_tea_meron,
                R.string.address_meron,
                R.string.website_meron));
        coffeeTea.add(new Location(
                R.drawable.coffee_tea_bohemia_teahouse,
                R.string.coffee_tea_bohemia_tea_house,
                R.string.address_bohemia_tea_house,
                R.string.website_bohemia_tea_house));

        // Adapter for the populated array list
        LocationAdapter locationAdapter = new LocationAdapter(this, coffeeTea);

        // Set the adapter to the list view
        ListView listView = (ListView) findViewById(R.id.list_coffee_tea);
        listView.setAdapter(locationAdapter);
    }
}
