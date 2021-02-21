package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("PNQxsZ7n7TFJ2MUN9pEYdfia9QqDnOplVPhAwNV1")
                .clientKey("KqSiPIsuRLaeyijIlKTcsL5LRCOrUR8Swg7j9LFC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
