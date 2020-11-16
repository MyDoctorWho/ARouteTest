package com.weidi.modulec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/modulec/main")
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        return setContentView(R.layout.activity_main1)
        Log.e("===========modulec====","=====create")
    }

    override fun onStart() {
        super.onStart()
        Log.e("===========modulec====","=====start")
    }

    override fun onStop() {
        super.onStop()
        Log.e("===========modulec====","=====stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("===========modulec====","=====destroy")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.e("===========modulec====","=====attached")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.e("===========modulec====","=====detached")
    }
}
