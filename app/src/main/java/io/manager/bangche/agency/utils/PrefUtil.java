package io.manager.bangche.agency.utils;

import android.content.Context;
import android.content.SharedPreferences;

import io.manager.bangche.agency.application.App;
import io.manager.bangche.agency.base.Constant;

/**
 * Created by laucherish on 16/3/30.
 */
public class PrefUtil {

    private static final String PRE_NAME = "io.github.laucherish.purezhihud_preferences";
    private static final String PRE_NIGHT = "night";

    private static SharedPreferences getSharedPreferences() {
        return App.getContext()
                .getSharedPreferences(PRE_NAME, Context.MODE_PRIVATE);
    }

    public static void setNight(){
        getSharedPreferences().edit().putBoolean(PRE_NIGHT, true).commit();
    }

    public static void setDay(){
        getSharedPreferences().edit().putBoolean(PRE_NIGHT, false).commit();
    }

    public static void changeDayNight(){
        boolean change = !getSharedPreferences().getBoolean(PRE_NIGHT, false);
        getSharedPreferences().edit().putBoolean(PRE_NIGHT, change).commit();
    }

    public static boolean isNight(){
        return getSharedPreferences().getBoolean(PRE_NIGHT, false);
    }

    public static int getThemeRes(){
        if (!isNight()) {
            return Constant.RESOURCES_DAYTHEME;
        } else {
            return Constant.RESOURCES_NIGHTTHEME;
        }
    }
}
