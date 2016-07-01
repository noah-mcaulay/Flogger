package com.amoeba.flogger;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "floggerapp";
    public static final String YOUR_CLIENT_KEY = "amoebaMasterKey";

    @Override
    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        //Parse.initialize(new Parse.Configuration.Builder())
                //.applicationId("floggerapp")

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

        // test creation of object
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
