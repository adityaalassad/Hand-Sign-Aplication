package com.example.belajarisyaratsibi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class KamusActivity extends AppCompatActivity {

    private RecyclerView rv_abjad;
    private ArrayList<ModelDataAbjad> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamus);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Belajar Bahasa Isyarat");

        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24);




        rv_abjad = findViewById(R.id.rv_abjad);
        rv_abjad.setHasFixedSize(true);
        data.addAll(dataAbjad.ambilData_abjad());
        tampilDataAbjad();



}

    private void tampilDataAbjad() {
        rv_abjad.setLayoutManager(new LinearLayoutManager(this));
        abjadAdapter colokanCard = new abjadAdapter(data);
        rv_abjad.setAdapter(colokanCard);
    }


}