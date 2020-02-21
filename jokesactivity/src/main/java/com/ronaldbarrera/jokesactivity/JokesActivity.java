package com.ronaldbarrera.jokesactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    TextView jokeTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        jokeTextview = findViewById(R.id.joke_textView);

        Intent intent = getIntent();
        if(intent != null) {
            String joke = intent.getStringExtra(Intent.EXTRA_TEXT);
            jokeTextview.setText(joke);
        }
    }
}
