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

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        routeInfo k = new routeInfo();
        k.depatureSet("あいおうえお");
//routeInfo.station.class::depatureSet("渋谷");

        //.depatureSet(String time)


        TextView textView = (TextView) findViewById(R.id.textView1);
        // テキストビューのテキストを設定
        textView.setText(k.depatureGet());

        TextView textView1 = (TextView) findViewById(R.id.textView2);
        // テキストビューのテキストを設定
        textView1.setText("新宿");

        Button btn = (Button)findViewById(R.id.button_return);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //インテントスタンス
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.google.com"));
                //ブラウザ
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main , menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
