package com.Lesson_2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        System.out.println(id);
        TextView tv = findViewById(R.id.tv);
        tv.setText(item.getTitle());
        if (item.isChecked()) item.setChecked(false);
        else item.setChecked(true);
        return super.onOptionsItemSelected(item);
    }
}
