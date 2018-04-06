package com.example.ayooluwa.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //thread for splash screen running
        Thread logoTimer = new Thread() {
        public void run() {
            try {sleep(2000);
            } catch (InterruptedException e) {
                Log.d("Exception", "Exception" + e);
            } finally {
                startActivity(new Intent(Main3Activity.this, Main2Activity.class));
            }
finish();

}

};

logoTimer.start();

}


}

