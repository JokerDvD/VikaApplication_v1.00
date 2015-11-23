package nit.vikaapplication_v100.SplashActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

import nit.vikaapplication_v100.FaceActivity;
import nit.vikaapplication_v100.R;

public class SplashActivity extends AppCompatActivity {
    private long Delay = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer RunSplash = new Timer();
        TimerTask ShowSplash = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent myIntent = new Intent(SplashActivity.this,
                        FaceActivity.class);
                startActivity(myIntent);
            }
        };
        RunSplash.schedule(ShowSplash, Delay);
    }
}

