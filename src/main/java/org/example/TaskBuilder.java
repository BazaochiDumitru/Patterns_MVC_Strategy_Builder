package org.example;

// Builder Pattern
public class TaskBuilder {
    private String name;
    private int priority;

    public TaskBuilder name(String name) {
        this.name = name;
        return this;
    }

    public TaskBuilder priority(int priority) {
        this.priority = priority;
        return this;
    }

    public Task build() {
        return new Task(name, priority);
    }
}
