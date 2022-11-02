package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Button btnchat=findViewById(R.id.b1);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,  fragment_chat.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }

        });

        Button btnstatus=findViewById(R.id.b2);
        btnstatus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView , fragment_status.class , null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });

        Button btncalls=findViewById(R.id.b2);
        btnstatus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView ,  fragment_calls.class , null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });




    }
}