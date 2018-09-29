package com.argame.mary;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Lab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4);
        Log.d("ARGAME", "onCreate has executed....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ARGAME", "onStart has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ARGAME", "onResume has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ARGAME", "onStop has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ARGAME", "onPause has executed....");
    }

    public void toastie(View v) {
        Toast.makeText(this, "Toast is running.....", Toast.LENGTH_LONG).show();
        Log.d("ARGAME", "toast has executed....");
    }

    public void snackie(View v) {
        Snackbar.make(v, "Snackbar is displayed", Snackbar.LENGTH_LONG).show();
        Log.d("ARGAME", "Snackbar has executed....");
    }
}