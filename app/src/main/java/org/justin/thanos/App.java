package org.justin.thanos;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

/**
 * Created by Administrator on 2017/2/3.
 */

public class App extends Application {

    private static App mApp ;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this ;
    }

    public static App getInstance(){
        return mApp ;
    }

    public static Context getAppContext() {
        return mApp.getApplicationContext();
    }

    public static Resources getAppResources() {
        return mApp.getResources();
    }

    public String setBaseUrl() {
        return "https://api.douban.com/v2/";
    }

}
