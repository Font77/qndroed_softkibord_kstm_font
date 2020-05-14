package com.font77.heksikibord;

import android.app.Application;
public final class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //fontsovArride.setDefaultFont(this, "DEFAULT", "fonts/roboto_heks_jk.ttf");
        //fontsovArride.setDefaultFont(this, "MONOSPACE", "fonts/ddssmonodc.ttf");
        fontsovArride.setDefaultFont(this, "DEFAULT", R.font.roboto_heks_jk);
        fontsovArride.setDefaultFont(this, "MONOSPACE", R.font.ddssmonodc);
    }
}
