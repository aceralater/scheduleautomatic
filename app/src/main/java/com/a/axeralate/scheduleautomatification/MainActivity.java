package com.a.axeralate.scheduleautomatification;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import static com.a.axeralate.scheduleautomatification.R.layout.page_change;

public class MainActivity extends Activity {

    private Button button_segue, button_change, button_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        routeInfo k = new routeInfo();
        k.depatureSet("あいおうえお");

//routeInfo.station.class::depatureSet("渋谷");

        //.depatureSet(String time)


        TextView timeView1 = (TextView) findViewById(R.id.time1);
        // テキストビューのテキストを設定
        timeView1.setText(k.depatureGet());

        TextView placeView1 = (TextView) findViewById(R.id.textView1);
        // テキストビューのテキストを設定
        placeView1.setText("新宿");

//        //交通費表示
//        TextView textView = (TextView) findViewById(R.id.cost1);
//        // テキストビューのテキストを設定
//        textView.setText(k.depatureGet());
//
//        TextView textView1 = (TextView) findViewById(R.id.cost2);
//        // テキストビューのテキストを設定
//        textView1.setText("新宿");



        TextView timeView2 = (TextView) findViewById(R.id.time2);
        // テキストビューのテキストを設定
        timeView2.setText(k.depatureGet());

        TextView placeView2 = (TextView) findViewById(R.id.textView2);
        // テキストビューのテキストを設定
        placeView2.setText("新宿");

        Button btn = (Button) findViewById(R.id.button_return);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                //インテントスタンス
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/calendar/"));
                //ブラウザ
                startActivity(intent);
            }
        });
    }
}




//                button_segue.setOnClickListener(this);
//
//                button_change = (Button) findViewById(R.id.button_change);
//                button_change.setOnClickListener(this);
//
//                if (v == button_segue) {
//
//                    intent = new Intent(this, subActivity.class);
//                    startActivityForResult(intent,0);
//
//
//
//                } else if (v == button_change) {
//                    setContentView(page_change);
//
//                    button_return = (Button) findViewById(R.id.button_return);
//                    button_return.setOnClickListener(this);
//
//                } else if (v == button_return) {
//                    setContentView(R.layout.activity_main);
//
//                    button_segue = (Button) findViewById(R.id.button_segue);
//                    button_segue.setOnClickListener(this);
//
//                    button_change = (Button) findViewById(R.id.button_change);
//                    button_change.setOnClickListener(this);
//
//        });



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main , menu);
//        return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }