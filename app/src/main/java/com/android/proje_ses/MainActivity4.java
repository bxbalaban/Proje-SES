package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    private ImageView imageView_kmesajlar;
    private ImageView imageView4_bkisiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView imageView4_bkisiler=(ImageView)findViewById(R.id.imageView4_bkisiler);
        ImageView imageView_kmesajlar=(ImageView)findViewById(R.id.imageView_kmesajlar);

        imageView_kmesajlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topage2=new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(topage2);
            }
        });
    }
}
