package com.ToDoList;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    /**
     * Reads user commands from the console and interacts with the to-do list application accordingly.
     * Supported commands: "add", "remove", "quit".
     */
    public static void readCommand() {
        String command;
        do {
            toDoList.displayTasks();
            System.out.println("Available commands: add / remove / quit");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "add":
                    addTask();
                    break;
                case "remove":
                    removeTask();
                    break;
                case "quit":
                    System.out.println("Exiting the to-do list application.");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
        } while (!command.equals("quit"));
    }

    private static void addTask() {
        System.out.println("Enter a new task description:");
        String taskDescription = scanner.nextLine();
        toDoList.addTask(taskDescription);
    }

    private static void removeTask() {
        System.out.println("Enter the ID of the task to remove:");
        int taskId = scanner.nextInt();
        toDoList.removeTask(taskId);
        scanner.nextLine();
    }
}
