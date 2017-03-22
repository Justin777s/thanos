package com.thanos.android.core;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;



/**
 * Application 抽象类
 *
 * Created by Administrator on 2017/2/3.
 */

public abstract class CoreApp extends Application {

    private static CoreApp mApp ;

    @Override
    public void onCreate() {
        super.onCreate();
        mApp = this ;

    }

    public static synchronized  CoreApp getInstance(){
        return mApp ;
    }

    public static Context getAppContext() {
        return mApp.getApplicationContext();
    }

    public static Resources getAppResources() {
        return mApp.getResources();
    }

    public abstract String setBaseUrl();

}
