package com.mulyadifamily.bisyaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);
        setTitle("Nama Hari");
    }

    public void pindahHariSenin(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Senin.class);
        startActivity(intent);
    }

    public void pindahHariSelasa(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Selasa.class);
        startActivity(intent);
    }

    public void pindahHariRabu(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Rabu.class);
        startActivity(intent);
    }

    public void pindahHariKamis(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Kamis.class);
        startActivity(intent);
    }

    public void pindahHariJumat(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Jumat.class);
        startActivity(intent);
    }

    public void pindahHariSabtu(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Sabtu.class);
        startActivity(intent);
    }

    public void pindahHariMinggu(View view) {
        Intent intent = new Intent(HariActivity.this, Hari_Minggu.class);
        startActivity(intent);
    }
}
