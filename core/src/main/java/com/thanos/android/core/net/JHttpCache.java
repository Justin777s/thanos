package com.thanos.android.core.net;

import com.thanos.android.core.CoreApp;

import java.io.File;

import okhttp3.Cache;

/**
 * Created by Administrator on 2017/2/3.
 */

public class JHttpCache {

    private static final int HTTP_RESPONSE_DISK_CACHE_MAX_SIZE = 50*1024*1024;

    public static Cache getCache(){
        return new Cache(new File(CoreApp.getAppContext().getCacheDir().getAbsolutePath()
                +File.separator+"data/NetCache"),
                HTTP_RESPONSE_DISK_CACHE_MAX_SIZE
        );
    }
}
