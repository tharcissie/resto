package com.example.teacher.resto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    AppCompatEditText edit1;
    AppCompatEditText edit2;
    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edit1= (AppCompatEditText)findViewById(R.id.edit1) ;
        edit2= (AppCompatEditText)findViewById(R.id.edit2) ;
        button= (AppCompatButton) findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "logged in", Toast.LENGTH_SHORT).show();
                 openMain2Activity();
             }
         });


    }
    public void openMain2Activity(){
        Intent intent= new Intent(this, Main2Activity.class);
        startActivity(intent);

    }
}
