package com.example.component.trains;

import com.example.Echo;
import com.example.IUiReusable;
import com.example.IView;

/**
 *
 * Created by Administrator on 2016/11/21.
 */

public class TrainsReusableView implements IUiReusable,IView {




    @Override
    public IView getView(Object context) {
        return this;
    }

    @Override
    public void onDestory(Object context) {
    }

    @Override
    public void onDisplay() {
        Echo.o("TrainsReusableView is display");
    }
}
