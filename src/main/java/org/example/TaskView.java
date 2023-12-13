package org.example;

import java.util.List;

// View
public class TaskView {
    public void displayTasks(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println(task.getName() + " (Priority: " + task.getPriority() + ")");
        }
    }
}
