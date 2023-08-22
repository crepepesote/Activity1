package co.edu.uptc.view.Dialogs;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import co.edu.uptc.view.Custom.CustomButton;

public class DialogDeleteTask extends JDialog {
    private JLabel labelName;
    private JTextArea textAreaName;
    private CustomButton deleteTask;

    public DialogDeleteTask(ActionListener listener) {
        setSize(400, 400);
        setLayout(new GridBagLayout()); // Cambiamos el layout a GridBagLayout
        initComponents(listener);
        setVisible(true);
    }

    private void initComponents(ActionListener listener) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        labelName = new JLabel("Nombre: ");
        add(labelName, gbc);

        gbc.gridy = 1;
        textAreaName = new JTextArea();
        textAreaName.setPreferredSize(new Dimension(200, 30));
        add(textAreaName, gbc);

        gbc.gridy = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        deleteTask = new CustomButton("Delete Task");
        deleteTask.addActionListener(listener);
        deleteTask.setActionCommand("delete");
        add(deleteTask, gbc);
    }

    public String getTextArea() {
        return textAreaName.getText();
    }
}