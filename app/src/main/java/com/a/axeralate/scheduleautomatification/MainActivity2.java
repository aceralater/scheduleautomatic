package com.a.axeralate.scheduleautomatification;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends Activity implements GetDirectionTask.OnGetDirectionFinishListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        new GetDirectionTask(MainActivity2.this).execute("http://maps.googleapis.com/maps/api/directions/json?origin=Brooklyn&destination=Queens&sensor=false&departure_time=1343605500&mode=transit&language=ja");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onGetDirectionFinish(GDirectionsResponse result) {
        if (result == null) {
            Toast.makeText(this, "取得できませんでした。", Toast.LENGTH_SHORT).show();
            return;
        }
        String str = result.getRoute(0).getLegs().get(0).getArrivalTime().getText();
        String AAA = "";

        for(int i= 0; i < result.getRoute(0).getLegs().size(); i++) {
            Log.d("出発時刻",result.getRoute(0).getLegs().get(i).getDepartureTime().getText());
            AAA+= "出発時刻"+ result.getRoute(0).getLegs().get(i).getDepartureTime().getText()+"\n";
            Log.d("到着時刻", result.getRoute(0).getLegs().get(i).getArrivalTime().getText());
            AAA+="到着時刻" + result.getRoute(0).getLegs().get(i).getArrivalTime().getText()+"\n";
            for (int j= 0; j < result.getRoute(0).getLegs().get(i).getSteps().size(); j++) {
                GDirectionsResponse.GStep step = result.getRoute(0).getLegs().get(i).getSteps().get(j);
                Log.d("経路", step.getHtml_instructions());
                AAA += "経路"+ step.getHtml_instructions()+"\n";
               /* if(step.getTrasitDetails() != null){
                    Log.d("出発地",step.getTrasitDetails().getDeparture_stop().getName());
                    Log.d("到着地",step.getTrasitDetails().getArrival_stop().getName());
                }
                */
               // Log.d("経路", step.getHtml_instructions());
               // for (int k= 0; k < step.getSteps().size(); k++) {
                   // Log.d("経路", step.getSteps().get(k).getHtml_instructions());
               // }
            }
            TextView textView = (TextView)findViewById(R.id.aaa);
            TextView textView1 = (TextView)findViewById(R.id.textView2);
            textView.setText(AAA);
        }
    }
}
