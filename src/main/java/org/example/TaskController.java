package org.example;

import java.util.Comparator;

// Controller
public class TaskController {
    private TaskList taskList;
    private TaskView taskView;

    public TaskController(TaskList taskList, TaskView taskView) {
        this.taskList = taskList;
        this.taskView = taskView;
    }

    public void addTask(Task task) {
        taskList.addTask(task);
    }

    public void displayTasks() {
        taskView.displayTasks(taskList.getTasks());
    }

    // Strategy Pattern: Implementați diferite strategii pentru sortarea sarcinilor
    public void sortTasks(Comparator<Task> comparator) {
        taskList.getTasks().sort(comparator);
    }
}
