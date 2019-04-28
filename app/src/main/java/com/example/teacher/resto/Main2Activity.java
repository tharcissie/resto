package com.example.teacher.resto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {


     Toolbar tool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        tool= (Toolbar) findViewById(R.id.toolbar2);

    }
}
