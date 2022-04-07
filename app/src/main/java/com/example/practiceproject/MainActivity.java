package com.example.practiceproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> berg = Arrays.asList("Mount Everest", "Bilingen", "K2", "Kebnekaise", "Hanneberg", "Hunneberg");

        recyclerView = findViewById(R.id.recyclerView);
        BergsAdapter bergsAdapter = new BergsAdapter(berg);
        recyclerView.setAdapter(bergsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}