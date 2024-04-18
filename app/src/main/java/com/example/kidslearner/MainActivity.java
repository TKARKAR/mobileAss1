package com.example.kidslearner;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    Button b1;
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Name = "nameKey";
    public static final String Age = "ageKey";
    SharedPreferences sharedpreferences;
    private Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.loadDataButton);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ed1.getText().toString();
                String age = ed2.getText().toString().trim();
                if (!name.isEmpty() && !age.isEmpty()) {
                    SharedPreferences.Editor editor = sharedpreferences.edit();
                    editor.putString(Name, name);
                    editor.putString(Age, age);
                    editor.apply();

                    Toast.makeText(MainActivity.this, "Data saved successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter name and age", Toast.LENGTH_SHORT).show();

                }
            }
        });

        getStartedButton = findViewById(R.id.getStartedButton);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SelectActivity.class));
            }
        });
    }
}
