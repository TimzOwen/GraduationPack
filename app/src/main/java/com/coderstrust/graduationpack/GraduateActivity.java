package com.coderstrust.graduationpack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class GraduateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduate);
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