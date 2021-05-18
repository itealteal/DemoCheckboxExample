package com.example.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox discount;
    TextView tvDisplay;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discount = findViewById(R.id.checkBoxDiscount);
        tvDisplay = findViewById(R.id.textViewDisplay);
        check = findViewById(R.id.btnCheck);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if(discount.isChecked()){
                    tvDisplay.setText("Discount is given.");
                }else{
                    tvDisplay.setText("Discount is not given");
                }
                Toast.makeText(getApplicationContext(),"Button Click",Toast.LENGTH_LONG).show();
            }
        });

    }
}