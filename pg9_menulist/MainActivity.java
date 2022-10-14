package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.CursorLoader;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.list,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.gmail)
        {
            Toast.makeText(this, "user clicked on gmail", Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.wasup)
        {
            Toast.makeText(this, "user clicked on whatsapp", Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.mesg)
        {
            Toast.makeText(this, "user clicked on messages", Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.clink)
        {
            Toast.makeText(this, "user clicked on copy to link", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.it)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}