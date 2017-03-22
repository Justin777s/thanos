package com.thanos.android.core.net;

import com.thanos.android.core.CoreApp;
import com.thanos.android.core.net.ssl.JTrustManager;

import org.apache.http.conn.ssl.SSLSocketFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/2/3.
 */

public class ReService {

    private static final String TAG = "ReService";
    private static final int TIMEOUT_READ = 20 ;
    private static final int TIMEOUT_CONNECTION = 10 ;
    private static final HttpLoggingInterceptor loggingIntercepter  = new HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY) ;

    private static JCacheInterceptor cacheInterceptor = new JCacheInterceptor();


    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            //ssl正式
    .sslSocketFactory(JTrustManager.getUnsafeOkHttpClient())
            .hostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER)
            //打印日志
            .addInterceptor(loggingIntercepter)
            //设置Cache
            .addNetworkInterceptor(cacheInterceptor)
            .addInterceptor(cacheInterceptor)
            .cache(JHttpCache.getCache())
            //time out
            .connectTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_READ,TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_READ,TimeUnit.SECONDS)
            //失败重连
            .retryOnConnectionFailure(true)
            .build() ;

    public static <T> T createApi(Class<T> clazz ,String url){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(clazz);
    }

    public static <T> T createApi(Class<T> clazz){
        return createApi(clazz, CoreApp.getInstance().setBaseUrl());
    }


}
