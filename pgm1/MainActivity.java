package com.example.s3mca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText first,second;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText) findViewById(R.id.first);
        second=(EditText) findViewById(R.id.second);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        result=(TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(first.getText().toString());
                n2=Integer.parseInt(second.getText().toString());
                n3=n1+n2;
                result.setText(String.valueOf(n3));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(first.getText().toString());
                n2=Integer.parseInt(second.getText().toString());
                n3=n1-n2;
                result.setText(String.valueOf(n3));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(first.getText().toString());
                n2=Integer.parseInt(second.getText().toString());
                n3=n1*n2;
                result.setText(String.valueOf(n3));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1=Integer.parseInt(first.getText().toString());
                n2=Integer.parseInt(second.getText().toString());
                int n3 = n2 / n1;
                result.setText(String.valueOf(n3));
            }
        });
    }
}