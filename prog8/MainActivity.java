package com.example.arrayadapt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       lv=findViewById(R.id.a);
        String[] names=new String[]{"afssf","fssfsf","sfsfsf","eqryyreuu","wtwy4uijkrt","gweyhejhr","eherur","sgsghwjhbsv","zvbsgwsgs"};

        ArrayAdapter<String> itemsadapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        lv.setAdapter(itemsadapter);

    }
}