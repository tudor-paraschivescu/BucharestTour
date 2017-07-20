package com.paraschivescu.tudor.bucharesttour;

/**
 * Class of a location that stores resource IDs for an image, a name, an address and a website
 */
class Location {

    private int mImageResourceId;
    private int mResName;
    private int mResAddress;
    private int mResWebsite;

    Location(int imageResourceId, int resName, int resAddress, int resWebsite) {
        this.mImageResourceId = imageResourceId;
        this.mResName = resName;
        this.mResAddress = resAddress;
        this.mResWebsite = resWebsite;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    int getResName() {
        return mResName;
    }

    int getResAddress() {
        return mResAddress;
    }

    int getResWebsite() {
        return mResWebsite;
    }
}
