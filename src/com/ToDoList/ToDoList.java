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
        System.out.println("--- My tasks ---");
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println("----------------");
    }

    @Override
    public void removeTask(int taskId) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskId) {
                tasks.remove(i);
                break;
            }
        }
    }
}
