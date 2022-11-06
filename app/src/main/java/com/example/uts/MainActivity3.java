package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView tv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv = findViewById(R.id.textview_first);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);
    }

    public void pindah3(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
        intent.putExtra("Value", st);
        startActivity(intent);
    }
}