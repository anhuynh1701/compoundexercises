package com.spkt.compoundexercises;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Sign_in extends AppCompatActivity {
    Button btnMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnMain =(Button) findViewById(R.id.tosignup);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Sign_in.this,Sign_up.class);
                startActivity(intent);
            }
        });
        btnMain =(Button) findViewById(R.id.signUpButton);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Sign_in.this,Menu.class);
                startActivity(intent);
            }
        });
    }
}