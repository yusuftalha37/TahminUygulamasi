package com.example.saytahminuygulamas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class sonuc extends AppCompatActivity {
    private ImageView imageView2;
    private TextView textView3;
    private Button button;

    private boolean sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);
        imageView2 = findViewById(R.id.imageView2);
        textView3 = findViewById(R.id.textView3);
        button = findViewById(R.id.button);
        sonuc =getIntent().getBooleanExtra("sonuc",false);
        if (sonuc){
            textView3.setText("KAZANDINIZ");
            imageView2.setImageResource(R.drawable.happy);

        }
        else {
            textView3.setText("KAYBETDİNİZ");
            imageView2.setImageResource(R.drawable.bad);

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (sonuc.this,Tahmin.class));
            }
        });

    }
}