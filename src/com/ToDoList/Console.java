package com.ToDoList;

import java.util.Scanner;

/**
 * This class represents a console interface for interacting with a to-do list application.
 */
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

    /**
     * Prompts the user to enter a new task description and adds it to the to-do list.
     */
    private static void addTask() {
        System.out.println("Enter a new task description:");
        String taskDescription = scanner.nextLine();
        toDoList.addTask(taskDescription);
    }

    /**
     * Prompts the user to enter the ID of the task to remove and removes it from the to-do list.
     * Displays an error message if the entered ID is not valid.
     */
    private static void removeTask() {
        System.out.println("Enter the ID of the task to remove:");
        int taskId;
        try {
            taskId = Integer.parseInt(scanner.nextLine());
            toDoList.removeTask(taskId);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter a valid integer ID.");
        }
    }
}
