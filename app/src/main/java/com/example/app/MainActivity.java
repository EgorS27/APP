package com.example.app;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ActivityBtnEnter.class);
        startActivity(intent);
            }

    public void onClick2(View view) {
        Intent intent = new Intent(this, ActivityBtnRegister.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }



    }











