package com.coderstrust.graduationpack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GraduateActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etName, etCourse;
    TextView tvName, tvCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate);

        btnSubmit = findViewById(R.id.btn_submit);
        etCourse = findViewById(R.id.et_grad_Course);
        etName = findViewById(R.id.et_grad_name);
        tvCourse = findViewById(R.id.tv_course);
        tvName = findViewById(R.id.tv_name);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString().trim();
                String course = etCourse.getText().toString().trim();

                tvName.setText(name);
                tvCourse.setText(course);



                Toast.makeText(GraduateActivity.this,"Data submitted successfully",Toast.LENGTH_SHORT).show();

            }
        });
    }

    //create the on Options menu created
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //create the menu inflater
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //create the onOptions menu selected

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //get the item id
        int menu_selected = item.getItemId();
        //switch to check which Item has been selected
        switch (menu_selected)
        {
            case R.id.home:
                startActivity(new Intent(GraduateActivity.this,MainActivity.class));
            case R.id.search:
                startActivity(new Intent(GraduateActivity.this,ListGraduateActivity.class));
            case R.id.backup:
                Toast.makeText(getApplicationContext(),"No data to back up",Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}