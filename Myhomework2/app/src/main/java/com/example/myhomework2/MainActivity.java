package com.example.myhomework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText ed1 = findViewById(R.id.textView);
        EditText ed2 = findViewById(R.id.textView2);
        EditText ed3 = findViewById(R.id.textView3);
        EditText ed4 = findViewById(R.id.textView4);
        EditText ed5 = findViewById(R.id.textView5);
        Button b = findViewById(R.id.button);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = (ed1.getText().toString());
                String Age = (ed2.getText().toString());
                String Job = (ed3.getText().toString());
                String Phonenumber = (ed4.getText().toString());
                String Email = (ed5.getText().toString());



                if (Name.isEmpty() || Age.isEmpty() || Job.isEmpty() || Phonenumber.isEmpty() || Email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Complete the requaier info", Toast.LENGTH_SHORT).show();
                    return;
                }


                Intent Plane = new Intent(MainActivity.this,MainActivity2.class);

                 Plane.putExtra("Name",Name);
                 Plane.putExtra("Age",Age);
                 Plane.putExtra("Job",Job);
                 Plane.putExtra("Phone",Phonenumber);
                 Plane.putExtra("Email",Email);

                 startActivity(Plane);
            }
        });
    }
}