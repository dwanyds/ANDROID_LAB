package com.example.ui_validation_co1p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname, uname, pass, email;
    boolean isAllchecked = false;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = (EditText) findViewById(R.id.fullname);
        uname = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);

        register = (Button) findViewById(R.id.b1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isAllChecked = CheckAll();
                if (isAllChecked) {
                    Toast.makeText(getApplicationContext(), "Valid Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private boolean CheckAll() {
        if (fname.length() == 0) {
            fname.setError("This field is required");
            return false;
        }
        if (uname.length() == 0 || uname.length() < 5) {
            uname.setError("This field is required");
            return false;
        }

        if (email.length() == 0 || email.length() < 5) {
            email.setError("This field is required");
            return false;
        }
        if (pass.length() == 0 || pass.length() < 5) {
            pass.setError("This field is required");
            return false;
        }
        return true;
    }
}









//        if (TextUtils.isEmpty(fname.getText().toString()))
//        {
//            Toast.makeText(getApplicationContext(),"Empty field not allowed!", Toast.LENGTH_SHORT).show();
//        }
//        if (TextUtils.isEmpty(uname.getText().toString()))
//        {
//            Toast.makeText(getApplicationContext(),"Empty field not allowed!", Toast.LENGTH_SHORT).show();
//        }
//
//        if (TextUtils.isEmpty(email.getText().toString()))
//        {
//            Toast.makeText(getApplicationContext(),"Empty field not allowed!", Toast.LENGTH_SHORT).show();
//        }
//
//        if (TextUtils.isEmpty(pass.getText().toString()))
//        {
//            Toast.makeText(getApplicationContext(),"Empty field not allowed!", Toast.LENGTH_SHORT).show();
//        }
//
//
//                                    }
//
//    });
//}
