package nit.vikaapplication_v100;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import nit.vikaapplication_v100.AboutActivity.AboutActivity;
import nit.vikaapplication_v100.QRCodeActivity.QRCodeActivity;

public class FaceActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
     View coordinatorLayoutView;
    Spinner spinnerValue1,spinnerValue2;

/* Button lib
*  https://github.com/rey5137/material/wiki/Button
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        coordinatorLayoutView= findViewById(R.id.snackbarPosition);

        spinnerValue1=(Spinner)findViewById(R.id.spinnerValue1);
        spinnerValue2=(Spinner)findViewById(R.id.spinnerValue2);

        String[] value1=getResources().getStringArray(R.array.value1);
        ArrayAdapter<String> adapterSpinner1=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,value1);
        adapterSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerValue1.setAdapter(adapterSpinner1);


        String[] value2=getResources().getStringArray(R.array.value2);
        ArrayAdapter <String> adapterSpinner2=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,value2);
        adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerValue1.setAdapter(adapterSpinner2);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent=new Intent(FaceActivity.this, QRCodeActivity.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.face, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.action_exit:


                Snackbar
                        .make(coordinatorLayoutView, "Test Action", Snackbar.LENGTH_LONG)
                        .setAction("Test", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                            }
                        })
                        .show();
                break;

            case R.id.action_main:

                break;

            case R.id.action_camera:

                break;

            case R.id.action_settings:

                break;
            case R.id.action_about:
                Intent intent=new Intent(FaceActivity.this, AboutActivity.class);
                startActivity(intent);

                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camara) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
