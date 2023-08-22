package co.edu.uptc.view.Dialogs;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import co.edu.uptc.view.Custom.CustomButton;

public class DialogTask extends JDialog {
    private JLabel labelName;
    private JLabel labeDescription;
    private JLabel date;
    private String name;
    private JComboBox<String> users;
    private CustomButton setTask;

    public DialogTask(String information, String[] users, ActionListener listener) {
        setSize(400, 500);
        setLayout(new GridBagLayout());
        initComponents(information, users, listener);
        setVisible(true);
    }

    private void initComponents(String information, String[] users, ActionListener listener) {
        String[] infor = information.split(",");
        setName1(infor[0]);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        labelName = new JLabel("Nombre: " + name);
        add(labelName, gbc);

        gbc.gridy = 1;
        labeDescription = new JLabel("Descripcion: " + infor[1]);
        add(labeDescription, gbc);

        gbc.gridy = 2;
        date = new JLabel("Fecha: " + infor[2]);
        add(date, gbc);

        gbc.gridy = 3;
        this.users = new JComboBox<>(users);
        add(this.users, gbc);

        gbc.gridy = 4;
        setTask = new CustomButton("Set Task");
        setTask.addActionListener(listener);
        setTask.setActionCommand("setTask");
        add(setTask, gbc);
    }

    private void setName1(String i) {
        this.name = i;
    }

    public String getUser() {
        return users.getSelectedItem().toString();
    }

    public String getTask() {
        return name;
    }
}