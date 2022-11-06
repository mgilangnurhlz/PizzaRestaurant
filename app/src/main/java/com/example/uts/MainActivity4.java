package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        st=getIntent().getExtras().getString("Value");
    }

    public void pindah41(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
        intent.putExtra("Value", st);
        startActivity(intent);
    }

    public void pindah42(View view) {
        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
        startActivity(intent);
    }
}