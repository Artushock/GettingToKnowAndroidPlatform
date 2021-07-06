package com.artushock.gettingtoknowandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text_layout);

        Button backButton = findViewById(R.id.back_btn);
        Button nextTaskButton = findViewById(R.id.edit_text_next_btn);
        Button sendButton = findViewById(R.id.edit_text_send_button);

        sendButton.setOnClickListener(v -> Toast.makeText(this, "Данные отправлены", Toast.LENGTH_SHORT).show());

        backButton.setOnClickListener(v -> finish());

        nextTaskButton.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), CalendarAcrivity.class);
            startActivity(intent);
        });
    }


}

