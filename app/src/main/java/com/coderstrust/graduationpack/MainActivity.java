package com.coderstrust.graduationpack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // step 1
        Button btnGradauate = findViewById(R.id.button2);
        Button btnIntern = findViewById(R.id.button);

        //step 2
        btnGradauate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //step 3
                Intent graduate = new Intent(MainActivity.this,GraduateActivity.class);
                startActivity(graduate);
            }
        });

        btnIntern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Intern you smart!!!",Toast.LENGTH_SHORT).show();
            }
        });


}}