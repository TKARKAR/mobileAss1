package com.example.kidslearner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ColorsActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView colorImageView;
    private View colorBackgroundView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // Find views
        colorImageView = findViewById(R.id.colorImageView);
        colorBackgroundView = findViewById(R.id.colorBackgroundView);

        // Find buttons for each color
        Button redButton = findViewById(R.id.redButton);
        Button yellowButton = findViewById(R.id.yellowButton);
        Button pinkButton = findViewById(R.id.pinkButton);
        Button greenButton = findViewById(R.id.greenButton);

        // Change button text
        redButton.setText("New Red Label");
        yellowButton.setText("New Yellow Label");
        pinkButton.setText("New Pink Label");
        greenButton.setText("New Green Label");

        // Add OnClickListener to each button
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        pinkButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }
    public void onClick(View v) {
        int imageResId;
        if (v.getId() == R.id.redButton) {
            imageResId = R.drawable.red_image;
        } else if (v.getId() == R.id.yellowButton) {
            imageResId = R.drawable.yellow_image;
        } else if (v.getId() == R.id.pinkButton) {
            imageResId = R.drawable.pink_image;
        } else if (v.getId() == R.id.greenButton) {
            imageResId = R.drawable.green_image;
        } else {
            return;
        }
        colorImageView.setImageResource(imageResId);
    }


}
