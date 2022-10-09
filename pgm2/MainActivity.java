package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag="Lifecycle Events";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onCreate invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onCreate invoked");

    }
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onStart invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onStart invoked");

    }
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onPause invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onPause invoked");

    }
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onStop invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onStop invoked");

    }
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onResume invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onResume invoked");

    }
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onRestart invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onRestart invoked");

    }
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast toast=Toast.makeText(getApplicationContext(),"onDestroy invoke",Toast.LENGTH_SHORT);
        toast.show();
        Log.d(tag,"onDestroy invoked");

    }

}