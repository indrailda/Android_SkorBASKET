package com.iinkus90example.menghitung_basket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
    TextView lagi, lagi2;
    int awal = 0;
    int awal2 = 0;
    //ayobelajar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        lagi = (TextView) findViewById(R.id.skorA);
        lagi2 = (TextView)findViewById(R.id.skorB);

    }

    public void one(View view) {
        awal = awal+1;
        lagi.setText(Integer.toString(awal));
    }

    public void two(View view) {
        awal = awal+2;
        lagi.setText(Integer.toString(awal));
    }

    public void three(View view) {
        awal = awal+3;
        lagi.setText(Integer.toString(awal));
    }

    public void atu(View view) {
        awal2 = awal2+1;
        lagi2.setText(Integer.toString(awal2));

    }

    public void duo(View view) {
        awal2 = awal2+2;
        lagi2.setText(Integer.toString(awal2));

    }

    public void tigo(View view) {
        awal2 = awal2+3;
        lagi2.setText(Integer.toString(awal2));

    }


    public void resut(View view) {
        awal = 0;
        awal2 = 0;
        lagi.setText(Integer.toString(awal));
        lagi2.setText(Integer.toString(awal2));
    }
}
