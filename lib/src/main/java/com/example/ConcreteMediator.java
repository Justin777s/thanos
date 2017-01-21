package com.example;

import java.util.HashMap;

/**
 *
 * Created by Administrator on 2016/11/21.
 */

public class ConcreteMediator extends AbsUiMediator {


    private final HashMap<String,HashMap<String,String>> registerTable  = new HashMap<String,HashMap<String,String>>() ;

    @Override
    public IUiReusable getComponentReusableView(String cmpName, String viewName) {
        try {

            String className = this.registerTable.get(cmpName).get(viewName);
             return  (IUiReusable)Class.forName(className).newInstance();

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



    public  HashMap<String,HashMap<String,String>> registe(String cmpTag,HashMap<String,String> viewTable){

        this.registerTable.put(cmpTag,viewTable);
        return this.registerTable;

    }


}
