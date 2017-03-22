package org.justin.thanos.utils;

import android.support.annotation.NonNull;

import com.thanos.android.core.utils.Logger;

import org.justin.thanos.BuildConfig;


/**
 * Created by Administrator on 2017/1/23.
 */

public class JLog {
    public static   boolean IsDebug = BuildConfig.LOG_DEBUG;

    public static void d(String tag ,String info){
        Logger.d(IsDebug,tag,info);
    }


    public static void d(@NonNull  String info){
              d(null,info);
    }

}
