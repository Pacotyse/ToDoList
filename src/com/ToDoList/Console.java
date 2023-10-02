package com.ToDoList;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);
    private static ToDoList toDoList = new ToDoList();

    /**
     * Reads user commands from the console and interacts with the to-do list application accordingly.
     * Supported commands: "show", "add", "remove", "quit".
     */
    public static void readCommand() {
        String command;
        do {
            System.out.println("Available commands: show / add / remove / quit");
            command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "show":
                    System.out.println("Displaying tasks:");
                    toDoList.displayTasks();
                    break;
                case "add":
                    System.out.println("Enter a new task description:");
                    String taskDescription = scanner.nextLine();
                    toDoList.addTask(taskDescription);
                    break;
                case "remove":
                    System.out.println("Enter the ID of the task to remove:");
                    int taskId = scanner.nextInt();
                    toDoList.removeTask(taskId);
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
}
