package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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
    public void d (View view){
        EditText etge = findViewById(R.id.gender1);
        String genderString = etge.getText().toString();
        SharedPreferences preferences = getSharedPreferences("test", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor
                .putString("GENDER", genderString)
                .commit();
        GenderActivity.this.setResult(RESULT_OK);
        finish();
    }
}
