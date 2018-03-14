package com.example.serena.activity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mLogin;
    Button mOspite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.btnLogin);
        mOspite = (Button) findViewById(R.id.btnOspite);

       /* mLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


            }

        });
        */



    }

    }

