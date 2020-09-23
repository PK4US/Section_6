package com.MyApp_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        System.out.println(id);

        if (id == 2131165326) CallToast();
        if (id == 2131165325) RedColor();
        if (id == 2131165327) YellowColor();
        if (id == 2131165323) BlueColor();

        if (item.isChecked()) item.setChecked(false);
        else item.setChecked(true);
        return super.onOptionsItemSelected(item);
    }

    public void CallToast() {
        Toast toast  = Toast.makeText(this, "Hello World!",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void  RedColor(){
        final ConstraintLayout ConstraintLayout = (ConstraintLayout) findViewById(R.id.ConstraintLayout);
        ConstraintLayout.setBackgroundColor(Color.RED);
    }
    public void  YellowColor(){
        final ConstraintLayout ConstraintLayout = (ConstraintLayout) findViewById(R.id.ConstraintLayout);
        ConstraintLayout.setBackgroundColor(Color.YELLOW);
    }
    public void  BlueColor(){
        final ConstraintLayout ConstraintLayout = (ConstraintLayout) findViewById(R.id.ConstraintLayout);
        ConstraintLayout.setBackgroundColor(Color.BLUE);
    }
}
