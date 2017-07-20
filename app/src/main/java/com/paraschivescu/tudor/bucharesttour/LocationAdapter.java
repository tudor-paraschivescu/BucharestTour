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
 * Created by tudor on 20/07/2017.
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
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Location location = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_image);
        assert location != null;
        imageView.setImageResource(location.getImageResourceId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.list_name);
        nameTextView.setText(getStringFromResource(location.getResName()));

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.list_address);
        addressTextView.setText(getStringFromResource(location.getResAddress()));

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
