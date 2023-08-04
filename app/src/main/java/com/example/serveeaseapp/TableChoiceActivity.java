package com.example.serveeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TableChoiceActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TableAdapter tableAdapter;
    private List<Table> tableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_choice);

        recyclerView = findViewById(R.id.recyclerViewTableChoice);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        tableList = new ArrayList<>();
        tableList.add(new Table(1, "1"));
        tableList.add(new Table(2, "2"));
        tableList.add(new Table(3, "3"));
        tableList.add(new Table(4, "4"));
        tableList.add(new Table(5, "5"));
        tableList.add(new Table(6, "6"));
        tableList.add(new Table(7, "7"));
        tableList.add(new Table(8, "8"));
        tableList.add(new Table(9, "9"));
        tableList.add(new Table(10, "10"));
        tableList.add(new Table(11, "11"));
        tableList.add(new Table(12, "12"));
        tableList.add(new Table(13, "13"));
        tableList.add(new Table(14, "14"));
        tableAdapter = new TableAdapter(tableList);
        recyclerView.setAdapter(tableAdapter);
    }

}

