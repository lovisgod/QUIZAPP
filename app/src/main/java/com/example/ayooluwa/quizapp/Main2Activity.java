package com.example.ayooluwa.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText SendValue;
    Button SendEditTextValue;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SendValue = (EditText) findViewById(R.id.editText1);
        SendEditTextValue = (Button) findViewById(R.id.button1);
        SendEditTextValue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("EdiTtEXTvALUE", SendValue.getText().toString());
                startActivity(intent);

            }

        });

    }
}
