package com.veally.android.route;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author <veally>
 */
public class MyApplication extends Application
{

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
        ARouter.openLog();
        ARouter.openDebug();
    }
}
