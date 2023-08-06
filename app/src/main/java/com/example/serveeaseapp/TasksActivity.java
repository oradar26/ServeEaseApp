package com.example.serveeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TasksActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TasksAdapter adapter;
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        recyclerView = findViewById(R.id.tasks_recyclerView);
        taskList = new ArrayList<>(); // Replace this with your actual list of tasks

        adapter = new TasksAdapter(taskList);
        recyclerView.setAdapter(adapter);
     }
}