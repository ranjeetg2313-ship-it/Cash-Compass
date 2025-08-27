package com.example.expensetrackersystem;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.example.expensetrackersystem.MainActivity;
import com.example.expensetrackersystem.R;

public class SplashActivity extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById(R.id.lottieAnimationView);

        // Set a delay before starting the main activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class); // Replace with your main activity
            startActivity(intent);
            finish();
        }, 3000); // Delay in milliseconds (3 seconds in this case)
    }
}
