package com.weidi.mainmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;

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

        findViewById(R.id.bt_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/modulec/main").navigation(getBaseContext(), new NavigationCallback() {
                    @Override
                    public void onFound(Postcard postcard) {
                        Log.e("=========found","modulec postcard = "+postcard.toString());
                    }

                    @Override
                    public void onLost(Postcard postcard) {

                    }

                    @Override
                    public void onArrival(Postcard postcard) {
                        Log.e("=========","modulec postcard = "+postcard.toString());
                    }

                    @Override
                    public void onInterrupt(Postcard postcard) {

                    }
                });
            }
        });

        findViewById(R.id.bt_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/moduled/main").navigation();
            }
        });
    }
}
