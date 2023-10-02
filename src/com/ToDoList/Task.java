package com.ToDoList;

public class Task {
    private static int task_id = 0;

    private final int id;
    private final String description;

    public Task (String description) {
        task_id++;
        this.id = task_id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    // This method is overriding a native Java's uppermethod.
    @Override
    public String toString() {
        return "Task #" + id + ": " + description;
    }

}
