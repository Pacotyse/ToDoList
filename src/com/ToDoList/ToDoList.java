package com.ToDoList;
import java.util.ArrayList;

class ToDoList implements TaskList {

    // ArrayList can be used to store tasks without limits on the number of entries.
    // In this case, it allows for dynamic storage of tasks.
    ArrayList<Task> tasks = new ArrayList<Task>();

    @Override
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    @Override
    public void displayTasks() {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    @Override
    public void removeTask(int taskId) {
        int index = taskId - 1;
        tasks.remove(index);
    }
}
