package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void c (View view){
        EditText etge = findViewById(R.id.gender1);
        String genderString = etge.getText().toString();
        SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
        preferences.edit()
                .putString("GENDER", genderString)
                .commit();
        setResult(RESULT_OK);
        finish();
    }
}
