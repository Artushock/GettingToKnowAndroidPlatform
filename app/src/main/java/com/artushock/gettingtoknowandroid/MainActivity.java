package com.artushock.gettingtoknowandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test_linear_layout);
        setContentView(R.layout.test_edit_text_layout);

        ToggleButton toggleButton = findViewById(R.id.remember_button);

//        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_on);
//                } else {
//                    toggleButton.setBackgroundResource(R.drawable.rounded_corner_button_off);
//                }
//            }
//        });
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "Данные отправлены", Toast.LENGTH_SHORT);
        toast.show();
    }


}