package com.becek39studio.ceksepatu_10118318;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnProfile;
    private Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfile=findViewById(R.id.btn_profile);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent profil = new Intent(MainActivity.this, profilActivity.class);
                startActivity(profil);
            }
        });
        btnLogout=findViewById(R.id.btn_logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //action
                Intent logout = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(logout);
            }
        });

    }
}