package sg.edu.rp.pd.braillent;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent IntentSplash = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(IntentSplash);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
