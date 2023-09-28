package com.ToDoList;
public class Main {
    public static void main(String[] args) {
        ToDoList myToDoList = new ToDoList();
        myToDoList.addTask(new Task("Nouvelle tache"));
        myToDoList.addTask(new Task("Nouvelle tache numero je sais pas combien"));
        myToDoList.addTask(new Task("Encore une nouvelle tache"));
        myToDoList.displayTasks();
        myToDoList.removeTask(3);
        myToDoList.addTask(new Task("Encore une nouvelle plop"));
        myToDoList.displayTasks();
    }
}
