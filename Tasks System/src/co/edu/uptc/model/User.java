package co.edu.uptc.model;

import java.util.ArrayList;

public class User {
    private ArrayList<String> tasksAssigened;
    private String name;

    public User(String name) {
        this.name = name;
        tasksAssigened = new ArrayList<String>();
    }

    public void addTask(String task) {
        tasksAssigened.add(task);
    }

    public void deleteTask(String task) {
        tasksAssigened.remove(task);

    }

    public String[] showAllTasks() {
        String[] information = new String[tasksAssigened.size()];
        for (int i = 0; i < information.length; i++) {
            information[i] = tasksAssigened.get(i);
        }
        return information;
    }

    public String getName() {
        return name;
    }

}
