package com.simpalm.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Simpalm on 11/7/16.
 */


public class BootReceiver extends BroadcastReceiver {

    private static String TAG = "BROADCAST_RECEIVER";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Boot Complete Received");
    }
}
