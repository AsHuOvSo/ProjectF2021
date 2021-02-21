package com.example.projectf2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables
        Button btnConfirmSen = (Button) findViewById(R.id.buttonConfirmSentence);
        EditText editTextEnterSentence = (EditText) findViewById(R.id.editTextEnterSentence);
        TextView textViewShowSentence = (TextView) findViewById(R.id.textViewShowSentence);


        btnConfirmSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable writtenSentence = editTextEnterSentence.getText();
                textViewShowSentence.setText(writtenSentence + "");
            }
        });

    }
}