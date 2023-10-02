package com.ToDoList;

import java.util.Scanner;

public class Console {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Reads user commands from the console and interacts with the to-do list application accordingly.
     * Supported commands: "show", "add", "remove", "quit".
     */
    public static void readCommand() {
        String command;
        do {
            System.out.println("Available commands: show / add / remove / quit");
            command = scanner.next().toLowerCase();

            switch (command) {
                case "show":
                    System.out.println("Displaying tasks:");
                    // Call a method to display tasks here if needed
                    break;
                case "add":
                    System.out.println("Enter a new task description:");
                    // Call a method to add a new task here if needed
                    break;
                case "remove":
                    System.out.println("Enter the ID of the task to remove:");
                    // Call a method to remove a task here if needed
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
