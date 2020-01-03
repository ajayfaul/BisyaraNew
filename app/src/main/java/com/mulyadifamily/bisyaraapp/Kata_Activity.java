package com.mulyadifamily.bisyaraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Kata_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata);
        setTitle("Kata Sehari Hari");

    }

    public void pindahKata1(View view) {
        Intent intent = new Intent(Kata_Activity.this, kata_1_Activity.class);
        startActivity(intent);
    }

    public void pindahKata2(View view) {
        Intent intent = new Intent(Kata_Activity.this, kata_2_Activity.class);
        startActivity(intent);
    }

    public void pindahKata3(View view) {
        Intent intent = new Intent(Kata_Activity.this, kata_3_Activity.class);
        startActivity(intent);
    }
}
