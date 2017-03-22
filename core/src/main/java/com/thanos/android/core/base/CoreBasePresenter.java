package com.thanos.android.core.base;

/**
 * Presenter
 * Created by Administrator on 2017/2/4.
 */

public abstract  class CoreBasePresenter<M,T> {

    public M mModel;
    public T mView ;

    public void attachVM(T v, M m){
        this.mView = v;
        this.mModel = m ;
        this.onStart();
    }

    public void detachVM(){
        mView = null ;
        mModel = null ;
    }

    public abstract void onStart();

}
