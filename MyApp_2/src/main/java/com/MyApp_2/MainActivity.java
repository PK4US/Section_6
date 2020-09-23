package com.MyApp_2;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

    public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout ll = (LinearLayout) findViewById(R.id.LinearLayout);
        final RadioButton radio_red = (RadioButton) findViewById(R.id.radio_red);
        final RadioButton radio_yellow = (RadioButton) findViewById(R.id.radio_yellow);

        radio_red.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.RED);
            }
        });

        radio_yellow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.YELLOW);
            }
        });

    }
}