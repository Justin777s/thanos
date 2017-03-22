package com.thanos.android.core.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Field;

/**
 * <p>Title: BaseFragment <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: NetDragon<／p>
 *
 * @author Justin
 * @version 2017/3/22
 */
public abstract class CoreBaseFragment extends Fragment{


    public abstract  int getFragmentLayoutId();



    public abstract  void onViewCreate(View v);
/*

    public   <T>  T findViewById(@IdRes int id){
        return (T)  getView().findViewById(id);
    }
*/
protected Context mCtx  = null ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         mCtx = getActivity();

        View view = inflater.inflate(getFragmentLayoutId(),container,false);

        onViewCreate(view);

        return view;
    }


//    @Override
//    public void onDetach() {
//        super.onDetach();
//
//        try {
//            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
//            childFragmentManager.setAccessible(true);
//            childFragmentManager.set(this, null);
//        } catch (NoSuchFieldException e) {
//            throw new RuntimeException(e);
//        } catch (IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
