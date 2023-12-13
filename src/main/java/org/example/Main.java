package org.example;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(taskList, taskView);

        // Builder Pattern: Crearea de sarcini personalizate
        Task task1 = new TaskBuilder().name("A inregistra video").priority(2).build();
        Task task2 = new TaskBuilder().name("A face proiectul").priority(1).build();
        Task task3 = new TaskBuilder().name("A scoate raportul la imprimanta").priority(3).build();

        taskController.addTask(task1);
        taskController.addTask(task2);
        taskController.addTask(task3);

        System.out.println("\nTasks (Unsorted):");
        taskController.displayTasks();

        // Strategy Pattern: Sortarea sarcinilor după prioritate
        taskController.sortTasks(Comparator.comparing(Task::getPriority));

        System.out.println("\nTasks (Sorted by Priority):");
        taskController.displayTasks();
    }
}










/*
Acest exemplu combină Model-View-Controller (MVC) Pattern cu Strategy Pattern pentru sortare
și Builder Pattern pentru crearea de sarcini personalizate
*/