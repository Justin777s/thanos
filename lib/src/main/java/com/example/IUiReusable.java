package com.example;

/**
 * 可复用UI 抽象
 * Created by Administrator on 2016/11/21.
 */

public  interface IUiReusable
{

        IView getView(Object context);

        void onDestory(Object context);

}
