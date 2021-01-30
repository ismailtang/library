package com.coredata.coredata;

import android.content.Context;
import android.content.SharedPreferences;

class coredata {

    public void save(Context context, String key, String value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public void saveInt(Context context, String key, int value) {
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.putInt(key, value);
        edit.commit();
    }

    public String get(Context context, String key) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getString(key, "");
    }

    public int getInt(Context context, String key, int DefaultValue) {
        return context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).getInt(key, DefaultValue);
    }

    public void clearAll(Context context){
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.clear();
        edit.commit();
    }

    public void remove(Context context, String key){
        SharedPreferences sharedPref = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPref.edit();
        edit.remove(key);
        edit.commit();
    }


}
