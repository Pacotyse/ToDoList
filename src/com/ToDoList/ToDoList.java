package com.ToDoList;

import java.util.ArrayList;

/**
 * This class represents a to-do list that can store and manage tasks.
 */
class ToDoList implements TaskList {

    // An ArrayList to store tasks without limits on the number of entries.
    // It allows for dynamic storage of tasks.
    ArrayList<Task> tasks = new ArrayList<Task>();

    /**
     * Adds a new task with the given description to the to-do list.
     *
     * @param description The description of the task to be added.
     */
    @Override
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    /**
     * Displays the list of tasks in the to-do list.
     */
    @Override
    public void displayTasks() {
        System.out.println("--- My tasks ---");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("----------------");
    }

    /**
     * Removes a task from the to-do list based on its ID.
     *
     * @param taskId The ID of the task to be removed.
     */
    @Override
    public void removeTask(int taskId) {
        // This method checks if there is a match between the taskId provided
        // and a task stored in the ArrayList. If found, the task is removed.
        // If not found, an error message is displayed.
        boolean taskFound = false;
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                taskFound = true;
                break;
            }
        }
        if (!taskFound) {
            System.out.println("No task with the given ID exists.");
        }
    }
}
