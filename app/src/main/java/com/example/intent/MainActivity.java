package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //deklarasi tombol
    private Button mBtn_login, mBtn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        mBtn_login = (Button)findViewById(R.id.btn_login);
        mBtn_register = (Button)findViewById(R.id.btn_register);

        //function tombol
        mBtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLogin = new Intent(getApplicationContext(),Login.class);
                startActivity(iLogin);
            }
        });

        mBtn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iRegister = new Intent(getApplicationContext(),Register.class);
                startActivity(iRegister);
            }
        });
    }
}
