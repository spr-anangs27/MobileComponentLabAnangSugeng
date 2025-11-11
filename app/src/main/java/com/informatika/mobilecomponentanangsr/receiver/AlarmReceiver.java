package com.informatika.mobilecomponentanangsr.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.informatika.mobilecomponentanangsr.util.NotificationHelper;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String title = intent.getStringExtra("title");

        NotificationHelper.showNotification(context, title, "Waktunya menyelesaikan tugas!");
    }
}
