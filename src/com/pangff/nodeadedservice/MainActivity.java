package com.pangff.nodeadedservice;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 Intent intent = new Intent(this, Alarmreceiver.class);  
         intent.setAction("arui.alarm.action");  
         PendingIntent sender = PendingIntent.getBroadcast(this, 0,  
                 intent, 0);  
         long firstime = SystemClock.elapsedRealtime();  
         AlarmManager am = (AlarmManager) this  
                 .getSystemService(Context.ALARM_SERVICE);  

         // 10秒一个周期，不停的发送广播  
         am.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, firstime,  
                 10 * 1000, sender);  
	}
}
