package nit.vikaapplication_v100.AboutActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.rey.material.widget.Button;

import nit.vikaapplication_v100.InfoFragments.AboutApplication;
import nit.vikaapplication_v100.InfoFragments.AboutKiz;
import nit.vikaapplication_v100.R;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    Button aboutApp, aboutKiz, aboutBtn3, aboutBtn4;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fm = getFragmentManager();
        aboutApp = (Button) findViewById(R.id.about_app);
        aboutApp.setOnClickListener(this);

        aboutKiz = (Button) findViewById(R.id.about_kiz);
        aboutKiz.setOnClickListener(this);

        aboutBtn3 = (Button) findViewById(R.id.about_app3);
        aboutBtn3.setOnClickListener(this);

        aboutBtn4 = (Button) findViewById(R.id.about_app4);
        aboutBtn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int position = 0;
        switch (v.getId()) {
            case R.id.about_app:
                position = 1;
                break;

            case R.id.about_kiz:
                position = 2;
                break;

            case R.id.about_app3:
                position = 3;
                break;

            case R.id.about_app4:
                position = 4;
                break;


        }
        replaceFragment(position);


    }

    private void replaceFragment(int position) {
        Fragment fragment = null;
        switch (position) {

            case 1:
                fragment = new AboutApplication();

                break;
            case 2:
                fragment = new AboutKiz();
                break;

            case 3:

                break;

            case 4:

                break;

            default:

                break;
        }

        if (fragment != null) {

            fm.beginTransaction().replace(R.id.fragmentPlace, fragment).commit();
        }
    }
}
