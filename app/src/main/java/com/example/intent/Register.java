package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    //deklarasi tombol
    private Button mRegister, mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //inisial tombol
        mRegister = (Button)findViewById(R.id.bt_register);
        mBack = (Button)findViewById(R.id.bt_back);

        //function tombol
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"belum ada isi",Toast.LENGTH_LONG).show();
            }
        });

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iBack);
                finish();
            }
        });
    }
}
