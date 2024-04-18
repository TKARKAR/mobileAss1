package com.example.kidslearner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FruitsActivity extends AppCompatActivity {
    String fruitList[]={"Apple","Orange","kiwi","Banana","watermelon","Grapes"};
    int images[]={R.drawable.apple,R.drawable.orange,R.drawable.kiwi,R.drawable.banana,R.drawable.watermelon,R.drawable.grapes};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        listView =(ListView) findViewById(R.id.listView);
        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getApplicationContext(),fruitList,images);
        listView.setAdapter(customBaseAdapter);

        }


}
