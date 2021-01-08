package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

   private  ImageView imageView7_mesajagit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        ImageView imageView7_mesajagit=(ImageView) findViewById(R.id.imageView7_mesajagit);
        imageView7_mesajagit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topage2=new Intent(Main2Activity.this, MainActivity2.class);
                startActivity(topage2);
            }
        });


    }

   /* public void yeniUyeEkranı(View view){
        Intent intentYeniUyeEkranı=new Intent(this,YeniUyeActivity.class);
        startActivity(intentYeniUyeEkranı);
    }*/
}
