package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
    }
    public void anaSayfaEkranı(View view){
        Intent intentAnaSayfa=new Intent(this,AnaActivity.class);
        startActivity(intentAnaSayfa);
    }
}
