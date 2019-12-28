package com.mulyadifamily.bisyaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WarnaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);

        setTitle("Nama Warna");
    }

    public void pindahWarnaBiru(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Biru.class);
        startActivity(intent);
    }

    public void pindahWarnaMerah(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Merah.class);
        startActivity(intent);
    }

    public void pindahWarnaHijau(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_HIjau.class);
        startActivity(intent);
    }

    public void pindahWarnaHitam(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Hitam.class);
        startActivity(intent);
    }

    public void pindahWarnaEmas(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Emas.class);
        startActivity(intent);
    }

    public void pindahWarnaPutih(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Putih.class);
        startActivity(intent);
    }

    public void pindahWarnaUngu(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Ungu.class);
        startActivity(intent);
    }

    public void pindahWarnaKuning(View view) {
        Intent intent = new Intent(WarnaActivity.this, Warna_Kuning.class);
        startActivity(intent);
    }
}
