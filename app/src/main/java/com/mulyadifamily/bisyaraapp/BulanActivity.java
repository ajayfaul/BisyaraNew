package com.mulyadifamily.bisyaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BulanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulan);
        setTitle("Nama bulan dalam setahun");
    }

    public void pindahBulanJanuari(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_JanuariActivity.class);
        startActivity(intent);
    }

    public void pindahBulanFebruari(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_FebruariActivity.class);
        startActivity(intent);
    }

    public void pindahBulanMaret(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_MaretActivity.class);
        startActivity(intent);
    }

    public void pindahBulanApril(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_AprilActivity.class);
        startActivity(intent);
    }

    public void pindahBulanMei(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_MeiActivity.class);
        startActivity(intent);
    }

    public void pindahBulanJuni(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_JuniActivity.class);
        startActivity(intent);
    }

    public void pindahBulanJuli(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_JuliActivity.class);
        startActivity(intent);
    }

    public void pindahBulanAgustus(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_AgustusActivity.class);
        startActivity(intent);
    }

    public void pindahBulanSeptember(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_SeptemberActivity.class);
        startActivity(intent);
    }

    public void pindahBulanOktober(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_OktoberActivity.class);
        startActivity(intent);
    }

    public void pindahBulanNovember(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_OktoberActivity.class);
        startActivity(intent);
    }

    public void pindahBulanDesember(View view) {
        Intent intent = new Intent(BulanActivity.this, Bulan_DesemberActivity.class);
        startActivity(intent);
    }
}
