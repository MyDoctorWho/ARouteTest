package com.example.moduleb;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.moduleb.function.MyProvider;

/**
 * Created by sunhewei on 2020-10-30
 *
 */

@Route(path = "/moduleB/activity1")
public class ModuleBActivity1 extends AppCompatActivity {

    @Autowired (name = "/myprovider/provider")
    MyProvider myProvider;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_module_bmain);

        myProvider.callFun();
    }
}
