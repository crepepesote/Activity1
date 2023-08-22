package co.edu.uptc.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

import co.edu.uptc.view.Dialogs.DialogAddTask;
import co.edu.uptc.view.Dialogs.DialogDeleteTask;
import co.edu.uptc.view.Dialogs.DialogTask;
import co.edu.uptc.view.Dialogs.DialogUser;

public class MyFrame extends JFrame {
    private myMenu menu;
    private myTasks tasks;
    private myUsers users;
    private DialogUser dialogUser;
    private DialogTask dialogTask;
    private DialogAddTask dialogAddTask;
    private DialogDeleteTask dialogDeleteTask;

    public MyFrame(ActionListener listener) {
        setSize(700, 600);
        setTitle("LinkedList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents(listener);
        setVisible(true);
    }

    private void initComponents(ActionListener listener) {
        menu = new myMenu(listener);
        add(menu);
        tasks = new myTasks(listener);
        users = new myUsers(listener);
    }

    public void changePanel(String panel) {
        switch (panel) {
            case "menu":
                setPanel(menu);
                break;
            case "tasks":

                setPanel(tasks);
                break;
            case "users":
                setPanel(users);
                break;
            default:
                break;
        }
    }

    public void setTasks(String[] information, MouseAdapter mouseAdapter) {
        tasks.setTasks(information, mouseAdapter);
    }

    public void showDialogTask(String information, String[] users, ActionListener listener) {
        dialogTask = new DialogTask(information, users, listener);

    }

    public void setUusers(String[] users, MouseAdapter mouseAdapter) {
        this.users.setUsers(users, mouseAdapter);
    }

    public void showDialogUsers(String information, String[] tasks) {
        dialogUser = new DialogUser(information, tasks);
    }

    public void showDeleteTask(ActionListener listener) {
        dialogDeleteTask = new DialogDeleteTask(listener);
    }

    public void showAddTask(ActionListener listener) {
        dialogAddTask = new DialogAddTask(listener);
    }

    private void setPanel(JPanel panel) {
        this.getContentPane().removeAll();
        this.add(panel);
        this.revalidate();
        this.repaint();
    }

    public String getNewTaskName() {
        return dialogAddTask.getName();
    }

    public String getNewTaskDescription() {
        return dialogAddTask.getDescription();
    }

    public String getNewTaskDate() {
        return dialogAddTask.getDate();
    }

    public String getDialogTaskName() {

        return dialogTask.getTask();
    }

    public String getDeleteTask() {
        return dialogDeleteTask.getTextArea();
    }

    public String getDialogUser() {
        return dialogTask.getUser();
    }

    public void setUsers(String[] information, MouseAdapter mouseAdapter) {
        users.setUsers(information, mouseAdapter);
    }

    public String getPanelName() {
        return users.getPanelName();
    }

    public String getPanelNameTasks() {
        return tasks.getPanelName();
    }
}
