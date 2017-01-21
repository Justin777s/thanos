package com.example.component.opencourse;

import com.example.AbsUiMediator;
import com.example.AbsColleague;
import com.example.ConcreteMediator;
import com.example.Echo;
import com.example.ICmp;
import com.example.IUiReusable;
import com.example.IView;


import java.util.HashMap;

/**培训认证组件
 * Created by Administrator on 2016/11/21.
 */

public class OpenCourseComponent extends AbsColleague implements ICmp {

    private static OpenCourseComponent instance;


    public OpenCourseComponent(AbsUiMediator mediator) {
        super(mediator);
    }


    @Override
    public void doSomething() {
        Echo.o("OpenCourseComponent.ope");
        IUiReusable ui = mediator.getcT().getReusable();
          IView view = ui.getView(new Object());
        view.onDisplay();
    }

    @Override
    public String getTag() {
        return OpenCourseComponent.class.getSimpleName();
    }

    @Override
    public HashMap<String, String> getShareViewTable() {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("OpenCourseComponent",OpenCourseComponent.class.getName());
        return map;
    }

    @Override
    public IUiReusable getReusable() {
        return new OpenCourseResuableView();
    }


    public static ICmp getInstance(AbsUiMediator mediator) {
        if(instance==null){
            instance = new OpenCourseComponent(mediator);
        }
        return instance;
    }

    public static void main(String[] args){

        ConcreteMediator c = new ConcreteMediator();
        getInstance(c).doSomething();


    }


}
