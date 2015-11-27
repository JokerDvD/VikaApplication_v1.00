package nit.vikaapplication_v100.ResponseAcitivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.ExecutionException;

import nit.vikaapplication_v100.Connection.Connection;
import nit.vikaapplication_v100.R;
import nit.vikaapplication_v100.RecourseFile.RecourseString;

public class ResponseAcivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    FragmentManager fragmentManager;
    Connection connection;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response_acivity);
        fragmentManager = getFragmentManager();


        connection = new Connection();

        progressDialog = new ProgressDialog(this);
        CoatsValidatyQuery query = new CoatsValidatyQuery();
        try {
            Bundle bundle = getIntent().getExtras();
            query.execute(bundle.getString(RecourseString.ScannedCode));
/*
* Пошел хардкод
*
* тут надо сделать обработку полученных данных от  потока
*
* */

            String test;
            if ((test = query.get()) == "true") {
                fragment = new PosititveResponseFragment();

            } else {
                fragment = new NegativeResponseFragment();
            }

            if (fragment != null) {
                fragmentManager.beginTransaction().replace(R.id.response_frame_layot, fragment).commit();
            }

            fragment = new NothinkToShow();
            fragmentManager.beginTransaction().replace(R.id.response_frame_layot, fragment).commit();

        } catch (NullPointerException ex) {
            fragmentManager.beginTransaction().replace(R.id.response_frame_layot, fragment).commit();

            //Show In activity Message Like "Sorry. It's null pointer Exception"
        } catch (InterruptedException e) {

            fragmentManager.beginTransaction().replace(R.id.response_frame_layot, fragment).commit();
            e.printStackTrace();
        } catch (ExecutionException e) {

            fragmentManager.beginTransaction().replace(R.id.response_frame_layot, fragment).commit();
            e.printStackTrace();
        }

    }

    private class CoatsValidatyQuery extends AsyncTask<String, Void, String> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog.show();


        }

        @Override
        protected String doInBackground(String... params) {


            return connection.coatsValidatyConnection(params[0]);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);


            progressDialog.dismiss();
            progressDialog.cancel();
        }
    }
}
