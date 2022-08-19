package com.example.myhomework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Name = findViewById(R.id.textView6);
        TextView Age = findViewById(R.id.textView7);
        TextView Job = findViewById(R.id.textView8);
        TextView Phonenumber = findViewById(R.id.textView9);
        TextView Email = findViewById(R.id.textView10);


        Bundle mybundle = getIntent().getExtras();

        String string1 = mybundle.getString("Name");
        String string2 = mybundle.getString("Age");
        String string3 = mybundle.getString("Job");
        String string4 = mybundle.getString("Phone");
        String string5 = mybundle.getString("Email");



        Name.setText(string1);
        Age.setText(string2);
        Job.setText(string3);
        Phonenumber.setText(string4);
        Email.setText(string5);
    }


}