package com.example.se7en.clinicadvisortest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainPage.this, CreateAccountPage.class);
        startActivity(intent);
    }

    public void login(View v) {
        Intent intent = new Intent(MainPage.this, LogIn.class);
        startActivity(intent);
    }
}
