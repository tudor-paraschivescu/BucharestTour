package com.paraschivescu.tudor.bucharesttour;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Custom adapter for the Location class
 */
class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    private String getStringFromResource(int resid) {
        return getContext().getResources().getString(resid);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        // Inflate the view if it does not exist
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the location placed at that position
        final Location location = getItem(position);

        // Set the image of the card
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image);
        assert location != null;
        imageView.setImageResource(location.getImageResourceId());

        // Set the name of the location
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_name);
        nameTextView.setText(getStringFromResource(location.getResName()));

        // Set the address of the location
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_address);
        addressTextView.setText(getStringFromResource(location.getResAddress()));

        // Add a listener to the website button
        final Button websiteButton = (Button) listItemView.findViewById(R.id.list_website);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri websiteUri = Uri.parse(getStringFromResource(location.getResWebsite()));
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW);
                websiteIntent.setData(websiteUri);
                getContext().startActivity(websiteIntent);
            }
        });

        return listItemView;
    }


}
