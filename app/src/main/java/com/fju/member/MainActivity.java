package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static final int RCL =10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edname = findViewById(R.id.name);
        EditText edaccount = findViewById(R.id.age);
        EditText edpassword = findViewById(R.id.gender);


    }
    public void a (View view){
        Intent intent1 = new Intent(MainActivity.this, NicknameActivity.class);
        startActivityForResult(intent1,RCL);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode==RCL){
            if(resultCode==RESULT_OK){
                edname.setText(getSharedPreferences("test",MODE_PRIVATE)
                        .getString("NAME",""));
                edaccount.setText(getSharedPreferences("test",MODE_PRIVATE)
                        .getString("AGE",""));
                edpassword.setText(getSharedPreferences("test",MODE_PRIVATE)
                        .getString("GENDER",""));
            }else {
                finish();
            }
        }

    }
}
