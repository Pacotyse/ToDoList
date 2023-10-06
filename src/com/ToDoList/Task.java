package com.ToDoList;

/**
 * This class represents a task with a unique ID and a description.
 */
public class Task {
    private static int task_id = 0;

    private final int id;
    private final String description;

    /**
     * Constructs a new task with the given description and assigns it a unique ID.
     *
     * @param description The description of the task.
     */
    public Task(String description) {
        task_id++;
        this.id = task_id;
        this.description = description;
    }

    /**
     * Gets the ID of the task.
     *
     * @return The ID of the task.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns a string representation of the task.
     * This method overrides the default `toString` method.
     *
     * @return A string in the format "Task #ID: Description".
     */
    @Override
    public String toString() {
        return "Task #" + id + ": " + description;
    }
}
