package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

import co.edu.uptc.view.Custom.CustomButton;
import co.edu.uptc.view.Custom.CustomPanel;

public class myTasks extends JPanel {
    private CustomPanel panel1;
    private CustomButton addTask;
    private CustomButton deleteTask;
    private CustomButton back;

    public myTasks(ActionListener listener) {
        setBackground(new Color(247, 247, 247));
        setLayout(new GridBagLayout()); // Establecer el layout a GridBagLayout
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);

        addTask = new CustomButton("Add Task");
        addTask.addActionListener(listener);
        addTask.setActionCommand("addTask");
        add(addTask, gbc);

        deleteTask = new CustomButton("Delete Task");
        deleteTask.addActionListener(listener);
        deleteTask.setActionCommand("deleteTask");
        gbc.gridy = 1;
        add(deleteTask, gbc);

        back = new CustomButton("Back");
        back.addActionListener(listener);
        back.setActionCommand("back");
        gbc.gridy = 2;
        add(back, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        panel1 = new CustomPanel("task");
        add(panel1, gbc);
    }

    public void setTasks(String[] information, MouseAdapter mouseAdapter) {
        panel1.setTasks(information, mouseAdapter);
    }

    public String getPanelName() {
        return panel1.getName();
    }
}
