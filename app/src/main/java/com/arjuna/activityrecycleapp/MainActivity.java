package com.arjuna.activityrecycleapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CoordinatorLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //onCreate
        Log.d("lifecycle", "Proses onCreate");

        //message pada android
        //1.Toast(short,Long)
        //2. Snackbar

        //memanggil activty: getContext, getApplicationContext, this

        Toast.makeText(getApplicationContext(), "Halo ini Toast Shport", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Halo on toast long", Toast.LENGTH_LONG).show();

        main = (CoordinatorLayout) findViewById(R.id.main);
        //Snackbar
        Snackbar snackbar = Snackbar.make(main, "Hello, ini snackbar", Snackbar.LENGTH_LONG);
        //menampilkan snackbar
        snackbar.show();

    }

    //onstrart

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "Proses onStart");
    }
    //onResume
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "Proses onResume");
    }
    //onPause

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "Proses onPause");
    }
    //onRestart

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "Proses onRestart");
    }

    //onDestroy

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy");
    }
}
