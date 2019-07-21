package com.example.myworkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    TextView tv_message;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        tv_message = findViewById(R.id.tv_message);
        intent = getIntent();
        String message = intent.getStringExtra("2552");
        tv_message.setText(message);
        tv_message.setTextSize(40);
    }
}
