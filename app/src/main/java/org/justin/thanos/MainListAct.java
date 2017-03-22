package org.justin.thanos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.thanos.android.core.base.CoreBaseFragmentActivity;
import com.thanos.android.core.utils.Logger;

import org.justin.thanos.fragment.MainListFrag;

/**
 * <p>Title: <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: NetDragon<／p>
 *
 * @author Justin
 * @version 2017/3/22
 */
public class MainListAct extends CoreBaseFragmentActivity{
    private static final String TAG = "MainListAct";

    @Override
    public void onAfterCreate(Bundle savedInstanceState) {
        Log.d(TAG,"create");
        Logger.d(TAG,"MainListAct create");
    }

    @Override
    public void onBeforeCreate(Bundle savedInstanceState) {
        Logger.d(TAG,"onBeforeCreate");
    }

    @Override
    public int getContentViewId() {
        Logger.d(TAG,"MainListAct getContentViewId");
        return R.layout.act_main_list;
    }

    @Override
    public int getFragmentContainerId() {
        Logger.d(TAG,"MainListAct getFragmentContainerId");
        return R.id.frag_container;
    }

    @Override
    public Fragment getFragment() {
        return MainListFrag.getInstance();
    }


}
