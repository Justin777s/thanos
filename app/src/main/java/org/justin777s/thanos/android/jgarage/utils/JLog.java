package org.justin777s.thanos.android.jgarage.utils;

import android.support.annotation.NonNull;

import org.justin777s.thanos.android.jgarage.BuildConfig;
import com.thanos.android.core.utils.Logger;


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
