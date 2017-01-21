package com.example;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/11/21.
 */

public interface ICmp {

    void doSomething();

    String getTag();

    HashMap<String,String> getShareViewTable();

    IUiReusable getReusable();

}
