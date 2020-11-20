package com.android.proje_ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void girisEkranı(View view){
        Intent intentGirisEkranı=new Intent(this,GirisActivity.class);
        startActivity(intentGirisEkranı);
    }
    public void yeniUyeEkranı(View view){
        Intent intentYeniUyeEkranı=new Intent(this,YeniUyeActivity.class);
        startActivity(intentYeniUyeEkranı);
    }
}
