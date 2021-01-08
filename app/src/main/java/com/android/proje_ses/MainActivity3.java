package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity3 extends AppCompatActivity {
    private RelativeLayout mlistLayout;
    private ImageView imageView7_metinalani;
    private ImageView imageView_bmesajlar;
    private ImageView imageView5_kkisiler;
    private ImageView imageView9_buton;

    private ImageView imageView_listen_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        imageView7_metinalani=(ImageView) findViewById (R.id.imageView7_metinalani);
        imageView9_buton=(ImageView) findViewById (R.id.imageView9_buton);
        imageView_bmesajlar=(ImageView) findViewById (R.id.imageView_bmesajlar);
        imageView5_kkisiler=(ImageView) findViewById (R.id.imageView5_kkisiler);

        imageView5_kkisiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topage2=new Intent(MainActivity3.this, MainActivity4.class);

                Pair[] pairs=new Pair[2];
                pairs[0] =new Pair<View,String>(imageView_bmesajlar,"mesaj");
                pairs[1]=new Pair<View,String>(imageView5_kkisiler,"kisi");

                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity3.this,pairs);

                startActivity(topage2,options.toBundle());
            }
        });


    }
}
