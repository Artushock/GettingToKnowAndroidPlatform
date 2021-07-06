package com.artushock.gettingtoknowandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalendarAcrivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendar_view);
        Button exitButton = findViewById(R.id.calendar_back_btn);

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String date = String.format("Выбрана дата: %d.%d.%d", dayOfMonth, month+1, year);
            Toast.makeText(view.getContext(), date, Toast.LENGTH_SHORT).show();
        });

        exitButton.setOnClickListener(v -> finish());
    }
}
