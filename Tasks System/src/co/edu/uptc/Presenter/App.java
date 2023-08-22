package co.edu.uptc.Presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;

import co.edu.uptc.model.Manager;
import co.edu.uptc.view.MyFrame;

public class App extends MouseAdapter implements ActionListener {
    private MyFrame view;
    private Manager manager;

    public App() {
        manager = new Manager();
        manager.addTask("Tarea 1", "yo", "20");
        manager.addTask("Tarea 2", "124o", "20");
        manager.addUser("Yesid");
        manager.addUser("Es re");
        manager.addUser("lindo");
        view = new MyFrame(this);
    }

    public static void main(String[] args) {
        new App();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        String source = ((JComponent) e.getSource()).getName();
        String[] information = source.split(",");
        if (information[1].equals("task")) {
            view.showDialogTask(manager.getTaskInformation(information[0]), manager.getUsers(), this);
        } else {
            view.showDialogUsers(information[0], manager.getUserInformation(information[0]));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String source = e.getActionCommand();
        switch (source) {
            case "tasks":
                view.setTasks(manager.getTasks(), this);
                view.changePanel("tasks");
                break;
            case "users":
                view.setUsers(manager.getUsers(), this);
                view.changePanel("users");
                break;
            case "setTask":
                manager.assignTask(view.getDialogUser(), view.getDialogTaskName());
                break;
            case "back":
                view.changePanel("menu");
                break;
            case "addTask":
                view.showAddTask(this);
                break;
            case "complete":
                view.changePanel("menu");
                manager.addTask(view.getNewTaskName(), view.getNewTaskDescription(), view.getNewTaskDate());
                break;
            case "deleteTask":
                view.showDeleteTask(this);
                break;
            case "delete":
                view.changePanel("menu");
                manager.deleteTask(view.getDeleteTask());
                break;
        }
    }

}
