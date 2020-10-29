package com.example.moduleb.intercept;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/**
 * Created by sunhewei on 2020-10-30
 */

@Interceptor(priority = 5)
public class TurnIntercept implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
//        if ("/moduleB/activity1".equals(postcard.getPath())) {
//            callback.onInterrupt(null);
//        }else {
//            callback.onContinue(postcard);
//        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {

    }
}
