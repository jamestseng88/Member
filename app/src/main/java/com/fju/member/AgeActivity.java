package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private String ageString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }

    public void c(View view) {
        EditText etag = findViewById(R.id.age1);
        ageString = etag.getText().toString();
        Intent intent3 = new Intent(AgeActivity.this, GenderActivity.class);
        SharedPreferences preferences = getSharedPreferences("test",MODE_PRIVATE);
        preferences.edit()
                .putString("AGE", ageString)
                .commit();
        startActivityForResult(intent3, 0);
        setResult(RESULT_OK);
        finish();
    }
}
