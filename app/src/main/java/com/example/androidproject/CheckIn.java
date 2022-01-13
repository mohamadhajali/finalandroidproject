package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class CheckIn extends AppCompatActivity {
    public static final String DEFAULT = "N/A";
    TextView id;
    TextView cap;
    TextView pric;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        String rid= sharedPreferences.getString("RoomID",DEFAULT);
        String capacity =  sharedPreferences.getString("Capacity",DEFAULT);
        String price =  sharedPreferences.getString("Price",DEFAULT);
        id = findViewById(R.id.roomId);
        cap = findViewById(R.id.roomCapacity);
        pric = findViewById(R.id.roomPriceByDay);
        id.setText(rid);
        cap.setText(capacity);
        pric.setText(price);
    }
}