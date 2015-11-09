package com.moser.michael.androidtodolist;

/**
 * Created by michaelmoser on 11/9/15.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        // Your Application ID and Client Key are defined elsewhere
        Parse.initialize(this, "@strings/ApplicationID", "@strings/ClientKey");
    }
}