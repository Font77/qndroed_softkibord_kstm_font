package com.font77.softqibord;

import android.app.Application;

/**
 * Created by DELL on 4/1/2017.
 */

public final class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        fontsovArride.setDefaultFont(this, "DEFAULT", "fonts/ddssmonodc.ttf");
        fontsovArride.setDefaultFont(this, "MONOSPACE", "fonts/ddssmonodc.ttf");
    }
}
