package mcteamgestapp.momo.com.mcteamgestapp;

import android.app.Application;

import mcteamgestapp.momo.com.mcteamgestapp.Models.UserInfo;

/**
 * Created by YassIne on 09/11/2015.
 */
public class MyApp extends Application {

    //The user who is actually connected/Who is successfully logged in
    private UserInfo mActualUser;

    public void onCreate(){
        super.onCreate();
        mActualUser = null;
    }

    public void setActualUser(UserInfo user){
        mActualUser = user;
    }

    public UserInfo getActualUser(){
        return this.mActualUser;
    }

}
