package com.a.axeralate.scheduleautomatification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by axeralate on 2014/11/03.
 */
public class PageChangeActivity extends Activity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_change);
        button = (Button) findViewById(R.id.button_segue);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageChangeActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
