package com.example.component.trains;

import com.example.AbsUiMediator;
import com.example.AbsColleague;
import com.example.ConcreteMediator;
import com.example.Echo;
import com.example.ICmp;
import com.example.IUiReusable;
import com.example.component.opencourse.OpenCourseResuableView;

import java.util.HashMap;

/**培训认证组件
 * Created by Administrator on 2016/11/21.
 */

public class TrainsComponent extends AbsColleague implements ICmp {

    private static TrainsComponent instance;


    public TrainsComponent(AbsUiMediator mediator) {
        super(mediator);
    }


    @Override
    public void doSomething() {
        Echo.o("i do nothing.");
    }

    @Override
    public String getTag() {
        return TrainsComponent.class.getSimpleName();
    }

    @Override
    public HashMap<String, String> getShareViewTable() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("TrainsReusableView",TrainsReusableView.class.getName());
        return map;
    }

    @Override
    public IUiReusable getReusable() {
        return new TrainsReusableView();
    }


    public static TrainsComponent getInstance(AbsUiMediator mediator) {
        if(instance==null){
            instance = new TrainsComponent(mediator);
        }
        return instance;
    }

    public static void main(String[] args){

        ConcreteMediator c = new ConcreteMediator();
        getInstance(c).doSomething();


    }


}
