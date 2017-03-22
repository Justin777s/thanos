package com.thanos.android.core.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by Administrator on 2017/2/3.
 */

public class CoreBaseActivity<T extends CoreBasePresenter, E extends CoreBaseModel>  extends AppCompatActivity {

    private static final String TAG = "CoreBaseActivity";

    public T mPresenter;
    public E mModel;

    protected Context mContext;



    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


    public void reload() {
        Intent intent = getIntent();
        overridePendingTransition(0, 0);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        finish();
        overridePendingTransition(0, 0);
        startActivity(intent);
    }
}
