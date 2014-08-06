package com.pangff.nodeadedservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class DaemonService extends Service {  
	  
    @Override  
    public IBinder onBind(Intent intent) {  
        return null;  
    }  
  
    @Override  
    public void onCreate() {  
        super.onCreate();  
        Log.v("=========", "***** DaemonService *****: onCreate");  
    }  
  
    @Override  
    public void onStart(Intent intent, int startId) {  
        Log.v("=========", "***** DaemonService *****: onStart");  
        // 这里可以做Service该做的事  
    }  
}  