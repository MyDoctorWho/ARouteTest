package com.weidi.modulec;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created By SunHeWei
 * Date :2020/11/16
 */
@Route(path = "/modulec/a1")
public class ModuleCActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main1);
    }
}
