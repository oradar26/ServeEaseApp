package com.example.serveeaseapp;

import java.util.Date;

public class Task {

    private String taskId;
    private Date date;
    private String description;

    public Task(String taskId, Date date, String description) {
        this.taskId = taskId;
        this.date = date;
        this.description = description;
    }


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
