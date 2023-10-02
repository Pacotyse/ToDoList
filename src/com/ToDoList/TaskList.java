package com.ToDoList;

public interface TaskList {
    void addTask(String description);
    void displayTasks();
    void removeTask(int taskId);
}
