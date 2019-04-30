package com.example.teacher.resto;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {


     Toolbar tool;
     DrawerLayout drawer;
     NavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        tool= (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(tool);
        drawer=(DrawerLayout)findViewById(R.id.drawer);
        navigation=(NavigationView)findViewById(R.id.navigation);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this, drawer, tool,R.string.open_drawer,R.string.close_drawer);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }
}
