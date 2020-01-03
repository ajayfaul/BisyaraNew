package com.mulyadifamily.bisyaraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PercakapanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percakapan);
        setTitle("Percakapan");
    }

    public void pindahPercakapan1(View view) {
        Intent intent = new Intent(PercakapanActivity.this, Percakapan_1Activity.class);
        startActivity(intent);
    }

    public void pindahPercakapan2(View view) {
        Intent intent = new Intent(PercakapanActivity.this, Percakapan_2Activity.class);
        startActivity(intent);
    }

    public void pindahPercakapan3(View view) {
        Intent intent = new Intent(PercakapanActivity.this, Percakapan_3Activity.class);
        startActivity(intent);
    }
}
