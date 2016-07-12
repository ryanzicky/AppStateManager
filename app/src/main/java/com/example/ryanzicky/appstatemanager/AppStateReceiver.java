package com.example.ryanzicky.appstatemanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ryanzicky on 2016/7/12.
 */
public class AppStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        if("android.intent.action.PACKAGE_INSTALL".equals(action)){
            System.out.println("应用被安装了");
        }else if("android.intent.action.PACKAGE_ADDED".equals(action)){
            System.out.println("<<<<<<<<<<<应用被安装了");
        }else if("android.intent.action.PACKAGE_REVOMED".equals(action)){
            System.out.println("应用被卸载了");
        }
    }
}
