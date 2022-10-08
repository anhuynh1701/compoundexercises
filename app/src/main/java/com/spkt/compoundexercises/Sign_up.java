package com.spkt.compoundexercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class Sign_up extends AppCompatActivity {
    Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignup = (Button) findViewById(R.id.backsignin);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Sign_up.this,Sign_in.class);
                startActivity(intent);
            }
        });
    }
}