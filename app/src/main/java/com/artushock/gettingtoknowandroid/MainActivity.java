package com.artushock.gettingtoknowandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test_linear_layout);
//        setContentView(R.layout.test_edit_text_layout);
        setContentView(R.layout.test_calendar_layout);

        ToggleButton toggleButton = findViewById(R.id.remember_button);
        CalendarView calendarView = (CalendarView) findViewById(R.id.calendar_view);


//        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_on);
//                } else {
//                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_off);
//                }
//            }
//        });

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = String.format("Выбрана дата: %d.%d.%d", dayOfMonth, month, year);
                Toast.makeText(view.getContext(), date, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "Данные отправлены", Toast.LENGTH_SHORT);
        toast.show();
    }
}