package com.example.kidslearner;

// SelectedActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


    public class SelectActivity extends AppCompatActivity {
        Spinner learnOptions;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_select);

            learnOptions = findViewById(R.id.learnOptions);
            learnOptions.setSelection(0, false);
            learnOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    String selectedOption = (String) adapterView.getItemAtPosition(position);
                    if (selectedOption != null) {
                        Intent intent;
                        switch (selectedOption) {
                            case "Colors":
                                intent = new Intent(SelectActivity.this, ColorsActivity.class);
                                startActivity(intent);
                                break;
                            case "Fruits":
                                intent = new Intent(SelectActivity.this, FruitsActivity.class);
                                startActivity(intent);
                                break;
                        }
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // Handle case where nothing is selected (optional)
                }
            });

            ArrayList<String> optionsList = new ArrayList<>();
            optionsList.add("Fruits");
            optionsList.add("Colors");
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, optionsList);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            learnOptions.setAdapter(adapter);
        }
    }
