package com.artushock.gettingtoknowandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_linear_layout);

        ToggleButton toggleButton = findViewById(R.id.remember_button);
        Button button = findViewById(R.id.next_task_btn);


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_on);
                } else {
                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_off);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), EditTextActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "Данные отправлены", Toast.LENGTH_SHORT);
        toast.show();
    }
}