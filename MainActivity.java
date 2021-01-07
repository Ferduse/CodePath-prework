package com.example.pre_workhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TextView textView = ((TextView) findViewById(R.id.text ));
        
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.coral));
            }
        });
        // change background color
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });
        // can change text to string
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        // reset all
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Ferduse!");
                textView.setTextColor(getResources().getColor(R.color.black));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.blue));

            }
        });

        //update label
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change text view to edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // if field is empty, update label
                if (userEnteredText.isEmpty()) {
                    textView.setText("Enter your own text!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });

    }
}