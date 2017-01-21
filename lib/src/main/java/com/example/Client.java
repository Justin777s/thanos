package com.example;

import com.example.component.opencourse.OpenCourseComponent;
import com.example.component.trains.TrainsComponent;

public class Client {

    public static void main(String[] args){

        //TODO 创建中介，从公共库走
        ConcreteMediator c = new ConcreteMediator();

        //将组件注册进来
        c.registe(TrainsComponent.getInstance(c).getTag(),TrainsComponent.getInstance(c).getShareViewTable());

        OpenCourseComponent.getInstance(c).doSomething();

    }


}
