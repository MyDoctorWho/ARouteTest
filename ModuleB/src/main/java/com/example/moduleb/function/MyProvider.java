package com.example.moduleb.function;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;


/**
 * Created by sunhewei on 2020-10-30
 */

@Route(path = "/myprovider/provider",name = "my_provider")
public class MyProvider implements IMProvider {
    @Override
    public void init(Context context) {

    }

    @Override
    public void callFun() {

        Log.e("==","====call my provider");
    }
}
