package com.thanos.android.core.utils;

import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by Administrator on 2017/1/23.
 */

public class Logger {

    private static final String TAG = "Logger";

    public static void d(boolean isDebug ,String tag ,@NonNull String info){
        if(isDebug){
            if(tag == null && "".equals(tag)){
                tag = TAG;
            }
            Log.d( tag  ,""+info);
        }
    }
}
