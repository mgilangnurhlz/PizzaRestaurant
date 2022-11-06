package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    TextView tv, tvw;
    String st, stt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv = findViewById(R.id.textview_first);
        tvw = findViewById(R.id.namaa);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);
        tvw.setText(st);


    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.sendiri:
                if (checked)
                    // Same day service
                    displayToast(getString(R.string.sendiri));
                    stt= "Ambil sendiri";
                break;
            case R.id.fastdeliv:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.fastdeliv));
                    stt= "Fast Delivery";
                break;
            default:
                // Do nothing.
                break;
        }
    }
    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    public void toast(View view) {
        Toast.makeText(this, "Terima kasih " +st+ " sudah memesan ditoko kami, Metode pengiriman pesanan Pepperoni Pizza anda dikirim menggunakan "+ stt, Toast.LENGTH_SHORT).show();
    }
}