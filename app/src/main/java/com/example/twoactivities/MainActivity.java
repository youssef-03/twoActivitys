package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputsend;
    TextView txtreply;
    Button btnsend;
    String messageSent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent2 = getIntent();
        String text = intent2.getStringExtra("message2");
        txtreply = findViewById(R.id.textReply);
        txtreply.setText(text);
        inputsend = findViewById(R.id.inputSend);
        txtreply = findViewById(R.id.textReply);
        btnsend = findViewById(R.id.btnSend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messageSent = inputsend.getText().toString();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("message",messageSent);
                startActivity(intent);

            }
        });
    }
}