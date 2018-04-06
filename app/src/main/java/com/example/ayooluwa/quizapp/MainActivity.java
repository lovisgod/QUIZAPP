package com.example.ayooluwa.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    TextView receive;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receive = (TextView)findViewById(R.id.nameView1);
        receive.setText(getIntent().getExtras().getString("EdiTtEXTvALUE"));
        name = receive.getText().toString();
    }
    public void submit(View view) {
        boolean  answer1 = answern1();
        boolean  answer2 = answern2();
        boolean answer3 = answern3();
        boolean answer4 = answern4();
        boolean answer5 = answern5();
        boolean answer6 = answern6();
        boolean answer7 = answern7();
        boolean answer8 = answern8();
        boolean answer9 = answern9();
        boolean answer10 = answern10();
        boolean answer11 = answern11();
        boolean answer12 = answern12();
        boolean answer13 = answern13();
        boolean answer14 = answern14();
        boolean answer15 = answern15();
        int theScore = calculateScore (answer1, answer5, answer9, answer10, answer15);
        String scoreMessage = createAccessSummary (name, theScore);
        Toast.makeText(this, scoreMessage, Toast.LENGTH_SHORT).show();

        score = 0;
    }
    public void reset(View view) {
        finish();
       startActivity(getIntent());

    }

    private boolean answern1 () {
        RadioButton myAnswer = findViewById(R.id.answer11);
        boolean answern1 = myAnswer.isChecked();
        return answern1;
    }
    private boolean answern2 () {
        RadioButton myAnswer = findViewById(R.id.answer21);
        boolean answern2 = myAnswer.isChecked();
        return answern2;
    }
    private boolean answern3 () {
        RadioButton myAnswer = findViewById(R.id.answer31);
        boolean answern3 = myAnswer.isChecked();
        return answern3;
    }
    private boolean answern4 () {
        RadioButton myAnswer = findViewById(R.id.answer12);
        boolean answern4 = myAnswer.isChecked();
        return answern4;
    }
    private boolean answern5 () {
        RadioButton myAnswer = findViewById(R.id.answer22);
        boolean answern5 = myAnswer.isChecked();
        return answern5;
    }
    private boolean answern6 () {
        RadioButton myAnswer = findViewById(R.id.answer32);
        boolean answern6 = myAnswer.isChecked();
        return answern6;
    }
    private boolean answern7 () {
        RadioButton myAnswer = findViewById(R.id.answer13);
        boolean answern7 = myAnswer.isChecked();
        return answern7;
    }
    private boolean answern8 () {
        RadioButton myAnswer = findViewById(R.id.answer23);
        boolean answern8 = myAnswer.isChecked();
        return answern8;
    }
    private boolean answern9 () {
        RadioButton myAnswer = findViewById(R.id.answer33);
        boolean answern9 = myAnswer.isChecked();
        return answern9;
    } private boolean answern10 () {
        RadioButton myAnswer = findViewById(R.id.answer14);
        boolean answern10 = myAnswer.isChecked();
        return answern10;
    }
    private boolean answern11 () {
        RadioButton myAnswer = findViewById(R.id.answer24);
        boolean answern11 = myAnswer.isChecked();
        return answern11;
    }
    private boolean answern12 () {
        RadioButton myAnswer = findViewById(R.id.answer34);
        boolean answern12 = myAnswer.isChecked();
        return answern12;
    }
    private boolean answern13 () {
       RadioButton myAnswer = findViewById(R.id.answer14);
        boolean answern13 = myAnswer.isChecked();
        return answern13;
    }
    private boolean answern14 () {
        RadioButton myAnswer = findViewById(R.id.answer25);
        boolean answern14 = myAnswer.isChecked();
        return answern14;
    }
    public boolean answern15 () {
        RadioButton myAnswer = findViewById(R.id.answer35);
        boolean answern15 = myAnswer.isChecked();
        return answern15;
    }
    private int calculateScore(boolean answern1,  boolean answern5,  boolean answern9, boolean answern10, boolean answern15) {
        if (answern1){
            score = score + 20;
        }
        if (answern5){
            score = score + 20;
        }
        if (answern9){
            score = score + 20;
        }
        if (answern10){
            score = score + 20;
        }
        if (answern15){
            score = score + 20;
        }
        return score;
    }

    private String createAccessSummary(String name,int score) {
        String scoreMessage = "Name : " + name;
        scoreMessage = scoreMessage +"\n TOTAL SCORE " + score + "%";
        scoreMessage = scoreMessage + "\n thanks for participating ";
        return scoreMessage;
    }

}
