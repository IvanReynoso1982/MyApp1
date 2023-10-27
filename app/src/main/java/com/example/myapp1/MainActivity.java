package com.example.myapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewGreetingMessage= findViewById(R.id.textviewMessage1);
        textViewGreetingMessage.setText("Hello World");
    }

    //public void onClickbtn(View view){}

}