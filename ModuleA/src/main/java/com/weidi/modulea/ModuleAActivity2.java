package com.weidi.modulea;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by sunhewei on 2020-10-30
 */

@Route(path = "/path/activity2")
public class ModuleAActivity2 extends AppCompatActivity {

    @Autowired String from = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        ARouter.getInstance().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulea_2);


        TextView tv = findViewById(R.id.tv1);
        tv.setText("jump from "+from);
    }
}
