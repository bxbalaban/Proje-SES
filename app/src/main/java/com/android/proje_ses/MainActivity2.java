package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView4_sesliasistan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        ImageView imageView4_sesliasistan=(ImageView) findViewById(R.id.imageView4_sesliasistan);

        imageView4_sesliasistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent topage2=new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(topage2);
            }
        });
    //sesli asistanı burada başlatacak
    }
}
