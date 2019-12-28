package com.mulyadifamily.bisyaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TanyaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanya);
        setTitle("Kata Tanya");
    }

    public void pindahTanyaApa(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Apa.class);
        startActivity(intent);
    }

    public void pindahTanyaApaKabar(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Apakabar.class);
        startActivity(intent);
    }

    public void pindahTanyaBagaimana(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Bagaimana.class);
        startActivity(intent);
    }

    public void pindahTanyaDimana(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Dimana.class);
        startActivity(intent);
    }

    public void pindahTanyaKapan(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Kapan.class);
        startActivity(intent);
    }

    public void pindahTanyaMengapa(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Mengapa.class);
        startActivity(intent);
    }

    public void pindahTanyaSiapa(View view) {
        Intent intent = new Intent(TanyaActivity.this, Tanya_Siapa.class);
        startActivity(intent);
    }
}
