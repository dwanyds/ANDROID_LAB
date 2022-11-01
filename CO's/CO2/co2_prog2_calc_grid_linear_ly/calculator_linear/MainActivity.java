package com.example.calculator_linear_ly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    TextView r;
    Button b1,b2,b3,b4;
    String s1,s2;
    Integer num1,num2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.first);
        e2=(EditText) findViewById(R.id.second);

        r=(TextView)findViewById(R.id.result);

        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.sub);
        b3=(Button) findViewById(R.id.mul);
        b4=(Button) findViewById(R.id.div);

//        s1=e1.getText().toString();
//        s2=e2.getText().toString();
//        num1=Integer.parseInt(s1);
//        num2=Integer.parseInt(s2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                result=num1+num2;
                r.setText(String.valueOf(result));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                result=num1-num2;
                r.setText(String.valueOf(result));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                result=num1*num2;
                r.setText(String.valueOf(result));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(e1.getText().toString());
                num2=Integer.parseInt(e2.getText().toString());
                result=num1/num2;
                r.setText(String.valueOf(result));
            }
        });


    }
}