package com.paraschivescu.tudor.bucharesttour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    private static final int NUMBER_OF_CARDS = 4;

    private int[] listIds = {R.id.card_tourist_attractions, R.id.card_coffee_tee,
            R.id.card_restaurants, R.id.card_pubs_bars};
    private Class[] activities = {TouristAttractions.class, CoffeeTea.class,
            Restaurants.class, PubsBars.class};

    private void createListeners() {
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            final int copyI = i;
            findViewById(listIds[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(StartActivity.this, activities[copyI]);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Create the listeners for the other activities
        createListeners();
    }
}
