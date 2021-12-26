package com.gzeinnumer.delaybuttonactive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setEnabled(false);
                button.setText("Wait 4 second...");

                new Handler().postDelayed(() -> {
                    button.setEnabled(true);
                    button.setText("Click Me");
                }, 4000);
            }
        });
    }
}