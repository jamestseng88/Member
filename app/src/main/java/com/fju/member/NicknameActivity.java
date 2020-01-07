package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }
    public void b (View view){
        EditText etna = findViewById(R.id.nickname1);
        nameString = etna.getText().toString();
        Intent intent2 = new Intent(NicknameActivity.this,AgeActivity.class);
        SharedPreferences preferences = getSharedPreferences("test", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor
                .putString("NICKNAME", nameString)
                .commit();
        startActivityForResult(intent2,0);
        NicknameActivity.this.setResult(RESULT_OK);
        finish();
    }
}
