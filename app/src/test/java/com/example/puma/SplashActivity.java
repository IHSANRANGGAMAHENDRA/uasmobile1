// SplashActivity.java
package com.example.puma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Sembunyikan action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Animasi fade in untuk logo
        ImageView logo = findViewById(R.id.logo);
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(2000);
        logo.startAnimation(fadeIn);

        // Set click listener untuk seluruh layout
        View rootView = findViewById(android.R.id.content);
        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MainActivity
                startActivity(new Intent(SplashActivity.this, SplashActivity.class));
                finish();
            }
        });
    }
}

