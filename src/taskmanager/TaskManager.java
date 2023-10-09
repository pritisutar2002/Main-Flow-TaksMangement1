/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String description;
    private String dueDate;

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task: " + name + "\nDescription: " + description + "\nDue Date: " + dueDate + "\n";
    }
}
public class TaskManager {

    public static void main(String[] args) {
         ArrayList<Task> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---------Task Management System---------");
            System.out.println(" ---1.Add Task ---");
            System.out.println(" ---2.Remove Task ---");
            System.out.println(" ---3.List Tasks ---");
            System.out.println(" ---4.Quit ---");
            System.out.print("Select an option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter due date: ");
                    String dueDate = scanner.nextLine();

                    Task task = new Task(name, description, dueDate);
                    taskList.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i).getName());
                        }

                        System.out.print("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber >= 1 && taskNumber <= taskList.size()) {
                            taskList.remove(taskNumber - 1);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 3:
                    if (taskList.isEmpty()) {
                        System.out.println("No tasks to display.");
                    } else {
                        System.out.println("--------------------Tasks--------------------");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                             System.out.println("--------------------1r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥r̥1"
                                     + "--------------------");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the Task Management System.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
    
}
