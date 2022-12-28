package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = findViewById(R.id.textview_first);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);



    }

    public void pindah2(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("Value", st);
        startActivity(intent);
    }
}