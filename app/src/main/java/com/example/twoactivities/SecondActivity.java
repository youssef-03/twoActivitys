package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtsent;
    Button btnreply;
    EditText inputreply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String text = intent.getStringExtra("message");
        txtsent = findViewById(R.id.textSend);
        txtsent.setText(text);
        btnreply = findViewById(R.id.btnReply);
        btnreply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messagereplied;
                inputreply = findViewById(R.id.inputReply);
                messagereplied = inputreply.getText().toString();
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("message2",messagereplied);
                startActivity(intent);
                
            }
        });

    }
}