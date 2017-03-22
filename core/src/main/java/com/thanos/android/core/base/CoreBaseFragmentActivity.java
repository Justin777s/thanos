package com.thanos.android.core.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.thanos.android.core.R;

/**
 * <p>Title: <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: NetDragon<／p>
 *
 * @author Justin
 * @version 2017/3/22
 */
public abstract class CoreBaseFragmentActivity extends FragmentActivity {



    protected FragmentManager fm = null ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        onAfterCreate(savedInstanceState) ;
        super.onCreate(savedInstanceState);

        setContentView(getContentViewId());
        fm = getSupportFragmentManager();
        Fragment frag = fm.findFragmentById(getFragmentContainerId());

        if(frag == null){
            frag = getFragment();
            fm.beginTransaction().add(getFragmentContainerId(),frag).commit();
        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        onBeforeCreate(savedInstanceState);

    }

    public abstract int getContentViewId();

    public abstract int getFragmentContainerId();

    public abstract Fragment getFragment();

    public abstract void onAfterCreate(Bundle savedInstanceState);
    public abstract void onBeforeCreate(Bundle savedInstanceState);
}
