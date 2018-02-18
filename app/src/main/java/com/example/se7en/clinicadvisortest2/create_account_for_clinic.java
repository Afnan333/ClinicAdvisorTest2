package com.example.se7en.clinicadvisortest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class create_account_for_clinic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_for_clinic);
    }

    public void On_Sing(View v) {
        Intent intent = new Intent(create_account_for_clinic.this,ClinicAccountPage.class);
        startActivity(intent);
    }
}
