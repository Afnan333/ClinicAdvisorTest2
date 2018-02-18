package com.example.se7en.clinicadvisortest2;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccountForUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_for_user);
    }

    public void singUp(View v) {
        Intent intent = new Intent(CreateAccountForUser.this,userAccount.class);
        startActivity(intent);
    }
}
