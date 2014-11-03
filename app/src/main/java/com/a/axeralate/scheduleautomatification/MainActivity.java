package com.a.axeralate.scheduleautomatification;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.a.axeralate.scheduleautomatification.R.layout.page_change;

public class MainActivity extends Activity implements GetDirectionTask.OnGetDirectionFinishListener{

    private Button button_segue, button_change, button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String provider_name;
        if( 8 > Build.VERSION.SDK_INT ) {
            provider_name = "content://calendar/";
        } else {
            provider_name = "content://com.android.calendar/";
        }
        long now = new Date().getTime();
        Uri schedule_uri   = Uri.parse(provider_name + "instances/when/" + now + "/" + (now + DateUtils.WEEK_IN_MILLIS));

        Context app_context = getApplicationContext();
        ContentResolver content_resolver = app_context.getContentResolver();
        Cursor cursor  = content_resolver.query(schedule_uri, null,"begin>="+now,null,"begin ASC");
        if(  cursor.moveToFirst()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm");

                String str_title          = cursor.getString(cursor.getColumnIndexOrThrow("title")        );
                String str_description    = cursor.getString(cursor.getColumnIndexOrThrow("description")  );
                String str_eventLocation  = cursor.getString(cursor.getColumnIndexOrThrow("eventLocation"));
                Long long_begin  = cursor.getLong  (cursor.getColumnIndexOrThrow("begin"));
                String str_tstart = simpleDateFormat.format(long_begin);


                Log.d("test", str_title);
                Log.d("location",str_eventLocation);
            new GetDirectionTask(this).execute("http://maps.googleapis.com/maps/api/directions/json?origin=Brooklyn&destination="+str_eventLocation+"&sensor=false&departure_time="+long_begin+"&mode=transit");


        }


    }

    @Override
    public void onGetDirectionFinish(GDirectionsResponse result) {

    }
}

