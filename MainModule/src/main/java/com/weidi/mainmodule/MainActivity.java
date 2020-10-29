package com.weidi.mainmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.weidi.modulea.ModuleAActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/path/moduleA").navigation();
            }
        });


        findViewById(R.id.bt_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/path/activity2")
                        .withString("from","MainModule").navigation();
            }
        });

        findViewById(R.id.bt_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build("/moduleB/activity1")
                        .navigation(
//                                getBaseContext(), new NavCallback() {
//                            @Override
//                            public void onArrival(Postcard postcard) {
//                                Log.e("===","===arrive");
//                            }
//
//                            @Override
//                            public void onInterrupt(Postcard postcard) {
//                                super.onInterrupt(postcard);
//                                Log.e("===","===BEILANJIE");
//
//                            }
//                        }
                        );
            }
        });
    }
}
