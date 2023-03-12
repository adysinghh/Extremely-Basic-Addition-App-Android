package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText num1EditText;
    EditText num2EditText;
    TextView sumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        // change the color of status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.white));
        }
        // change the color of status bar icon
        View decor = getWindow().getDecorView();
        decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        num1EditText = (EditText) findViewById(R.id.num1_edit_text);
        num2EditText = (EditText) findViewById(R.id.num2_edit_text);
        button = (Button) findViewById(R.id.add_button);
        sumTextView = (TextView) findViewById(R.id.sum_text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(num1EditText.getText().toString());
                double num2 = Double.parseDouble(num2EditText.getText().toString());
                double sum = num1 + num2;
                sumTextView.setText(String.valueOf(sum));
            }
        });
    }
}
