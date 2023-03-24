package com.example.saytahminuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Tahmin extends AppCompatActivity {
private  TextView textView2,kalanhak;
private Button button2;
private  int rastgelesayı;
private int sayac =5;
private EditText girdi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);
        textView2 = findViewById(R.id.textView2);
        kalanhak = findViewById(R.id.kalanhak);
        button2 = findViewById(R.id.button2);
        girdi = findViewById(R.id.girdi);
        Random r = new Random();
        rastgelesayı = r.nextInt(101);
        Log.e("Rasgele Sayı",String.valueOf(rastgelesayı));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayac = sayac - 1 ;
    int tahmin =Integer.parseInt(girdi.getText().toString());
    if (tahmin == rastgelesayı) {
        Intent i = new Intent(Tahmin.this,sonuc.class);
        i.putExtra("sonuc",false);
        startActivity(i);
        finish();
        return;
    }
    if (tahmin>rastgelesayı){
textView2.setText("Azalt");
kalanhak.setText("Kalan Hak :"+sayac);

    }
    if (tahmin<rastgelesayı){
        textView2.setText("Arttır");
        kalanhak.setText("Kalan Hak :"+sayac);

    }
    if (sayac==0){
        Intent i = new Intent(Tahmin.this,sonuc.class);
        i.putExtra("sonuc",true);
        startActivity(i);
        finish();

    }

girdi.setText("");

















    startActivity(new Intent(Tahmin.this,sonuc.class));

            }
        });
    }
}