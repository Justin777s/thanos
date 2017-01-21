package com.example;

import com.example.component.opencourse.OpenCourseComponent;
import com.example.component.trains.TrainsComponent;

import java.util.HashMap;

/**
 * AbsUiMediator
 *
 * Created by Administrator on 2016/11/21.
 */

public abstract class AbsUiMediator {


    protected TrainsComponent cT;//
    protected OpenCourseComponent cC;//

    public TrainsComponent getcT() {
        return this.cT;
    }

    public void setcT(TrainsComponent cT) {
        this.cT = cT;
    }

    public OpenCourseComponent getcC() {
        return this.cC;
    }

    public void setcC(OpenCourseComponent cC) {
        this.cC = cC;
    }




    /***
     * 获取可重用Ui
     * @param cmpName
     * @param viewName
     * @return
     */
    public abstract IUiReusable getComponentReusableView(String cmpName, String viewName);

}
