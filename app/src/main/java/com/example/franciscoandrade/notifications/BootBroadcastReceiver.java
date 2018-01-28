package com.example.franciscoandrade.notifications;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by franciscoandrade on 1/28/18.
 */

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startSeviceIntent= new Intent(context, MyNotificationService.class);
        startWakefulService(context, startSeviceIntent);

    }
}
