package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NativeActivity;
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
        SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
        preferences.edit()
                .putString("NICK", nameString)
                .commit();
        startActivityForResult(intent2,0);
        setResult(RESULT_OK);
        finish();
    }
}
