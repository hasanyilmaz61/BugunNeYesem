package com.example.bugunneyesem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView corbaismi;
    ImageView imageView;
    TextView malzemeler;
    TextView aciklama;
    int resim;

    String getaciklama,getmalzemler,getisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        corbaismi=findViewById(R.id.textView);
        malzemeler=findViewById(R.id.textView2);
        aciklama=findViewById(R.id.textView3);
        imageView=findViewById(R.id.imageView);


        getaciklama=getIntent().getStringExtra("aciklamalar");
        getmalzemler=getIntent().getStringExtra("malzemeler");
        getisim=getIntent().getStringExtra("corba ismi");
        corbaismi.setText(getisim);
        malzemeler.setText(getmalzemler);
        aciklama.setText(getaciklama);
        imageView.setImageBitmap( MainActivity.corbaresmi);

    }
}