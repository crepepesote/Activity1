package co.edu.uptc.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Manager {
    private LinkedList<User> users;
    private LinkedList<Task> tasks;

    public Manager() {
        users = new LinkedList<User>();
        tasks = new LinkedList<Task>();
    }

    public void addUser(String name) {
        users.add(new User(name));
    }

    public void addTask(String name, String description, String date) {
        tasks.add(new Task(name, description, date));
    }

    public String[] getUsers() {
        String[] information = new String[users.size()];
        for (int i = 0; i < information.length; i++) {
            information[i] = users.get(i).getName();
        }
        return information;
    }

    public String[] getTasks() {
        String[] information = new String[tasks.size()];
        for (int i = 0; i < information.length; i++) {
            information[i] = tasks.get(i).getName();
        }
        return information;
    }

    public String getTaskInformation(String name) {
        String information = "";
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                information = task.getName() + "," + task.getDescription() + "," + task.getDate();
                break;
            }
        }
        return information;
    }

    public String[] getUserInformation(String name) {

        for (User user : users) {
            if (user.getName().equals(name)) {
                return user.showAllTasks();
            }
        }
        return null;
    }

    public void deleteTask(String name) {
        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                tasks.remove(task);
                break;
            }
        }
    }

    public void assignTask(String nameUser, String nameTask) {
        for (User user : users) {
            if (user.getName().equals(nameUser)) {
                user.addTask(nameTask);
                break;
            }
        }
    }

    public void deleteAssinedTask(String nameUser, String nameTask) {
        for (User user : users) {
            if (user.getName().equals(nameUser)) {
                user.deleteTask(nameTask);
                break;
            }
        }
    }
}
