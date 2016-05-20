package io.manager.bangche.agency.application;

import android.app.Application;
import android.content.Context;

import io.manager.bangche.agency.utils.AppContextUtil;
import io.manager.bangche.agency.utils.L;

/**
 * Created by laucherish on 16/3/17.
 */
public class App extends Application {

    private static Context mApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = this;
        AppContextUtil.init(this);
        L.init();
    }

    // 获取ApplicationContext
    public static Context getContext() {
        return mApplicationContext;
    }
}
