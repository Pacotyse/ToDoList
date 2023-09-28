package com.ToDoList;

public class Task {
    private static int task_id = 0;

    private int id;
    private String description;

    public Task (String description) {
        task_id++;
        this.id = task_id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task #" + id + ": " + description;
    }

}
