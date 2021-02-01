package com.example.sharepref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
        String display = preferences.getString("display","");

        TextView displayInfo = (TextView) findViewById(R.id.textViewName);
        displayInfo.setText(display);
    }
}
