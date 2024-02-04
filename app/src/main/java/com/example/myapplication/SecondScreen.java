package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class SecondScreen extends AppCompatActivity {

    String myBestGroupMates[] = {"Dulat","Ruslan", "Yerkhan", "Nurzhan", "Alikhan"};

    ListView list;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        list = (ListView) findViewById(R.id.customListView);
        MyBestAdapter myBestAdapter = new MyBestAdapter(getApplicationContext(), myBestGroupMates);
        list.setAdapter(myBestAdapter);

    }
}