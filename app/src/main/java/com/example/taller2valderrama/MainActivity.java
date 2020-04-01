package com.example.taller2valderrama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapsActivity(View v){
        Intent intent=new Intent(v.getContext(),mapsActivity.class);
        startActivity(intent);
    }

    private void contactsActivity(View v){
        Intent intent=new Intent(v.getContext(),contactActivity.class);
        startActivity(intent);
    }

    private void cameraActivity(View v){
        Intent intent=new Intent(v.getContext(),mapsActivity.class);
        startActivity(intent);
    }
}
