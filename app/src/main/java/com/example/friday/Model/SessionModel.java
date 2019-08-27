package com.example.friday.Model;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionModel {

    public static final String PREF_COMPTON = "prefCmp";
    public static final String PREF_USERNAME = "prefUsername";
    public static final String PREF_PASSWORD = "prefPassword";
    public static final String IS_LOGIN = "isLogin";
    SharedPreferences sp;
    SharedPreferences.Editor editor;

    public SessionModel(Context context){
        sp = context.getSharedPreferences(PREF_COMPTON, context.MODE_PRIVATE);
        editor = sp.edit();
    }
    public void saveSharedPrefString(String keySharedPref, String value){
        editor.putString(keySharedPref, value);
        editor.commit();
    }

    public void saveSharedPrefInt(String keySharedPref, int value){
        editor.putInt(keySharedPref, value);
        editor.commit();
    }

    public void saveSharedPrefBoolean(String keySharedPref, boolean value){
        editor.putBoolean(keySharedPref, value);
        editor.commit();
    }

    public String getPrefUsername() {
        return sp.getString(PREF_USERNAME,"");
    }

    public String getPrefPassword() {
        return sp.getString(PREF_PASSWORD,"");
    }

    public boolean getIsLogin() {
        return sp.getBoolean(IS_LOGIN,false);
    }

    public void logOutUser(){
        editor.clear();
        editor.commit();
    }
}
