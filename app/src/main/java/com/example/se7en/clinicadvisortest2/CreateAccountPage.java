package com.example.se7en.clinicadvisortest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateAccountPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_page);
    }

    public void On_Clinic(View v) {
        Intent intent = new Intent(CreateAccountPage.this,create_account_for_clinic.class);
        startActivity(intent);
    }

    public void On_User(View v) {
        Intent intent = new Intent(CreateAccountPage.this,CreateAccountForUser.class);
        startActivity(intent);
    }
}
