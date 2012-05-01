package com.github.happyhour2012.android;

import android.os.Bundle;
import org.apache.cordova.*;

public class HelloAndroidActivity extends DroidGap {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
    }

}

