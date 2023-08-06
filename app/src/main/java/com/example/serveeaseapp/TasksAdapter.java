package com.example.serveeaseapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder>{

    private RecyclerView recyclerView;
    private List<Task> taskList;

    public TasksAdapter(List<Task> tableList) {
        this.taskList = taskList;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_cardview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = taskList.get(position);

        holder.taskDescription.setText(task.getDescription());
        holder.date.setText(String.valueOf(task.getDate()));
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CheckBox completeCheckBox;
        private TextView taskDescription;
        private TextView date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            completeCheckBox = itemView.findViewById(R.id.task_complete_CheckBox);
            taskDescription = itemView.findViewById(R.id.task_description);
            date = itemView.findViewById(R.id.task_date);
        }
    }
}
