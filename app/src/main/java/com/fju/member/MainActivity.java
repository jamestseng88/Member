package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static final int RCL =10;
    private EditText edgender;
    private EditText edage;
    private EditText edname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edname = findViewById(R.id.name);
        edage = findViewById(R.id.age);
        edgender = findViewById(R.id.gender);


    }
    public void a (View view){
        Intent intent1 = new Intent(MainActivity.this, NicknameActivity.class);
        startActivityForResult(intent1,RCL);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode==RCL){
            if(resultCode==RESULT_OK){
                edname.setText(getSharedPreferences("test", Context.MODE_PRIVATE)
                        .getString("NICKNAME",""));
                edage.setText(getSharedPreferences("test",Context.MODE_PRIVATE)
                        .getString("AGE",""));
                edgender.setText(getSharedPreferences("test",Context.MODE_PRIVATE)
                        .getString("GENDER",""));
            }else {
                finish();
            }
        }

    }
}
