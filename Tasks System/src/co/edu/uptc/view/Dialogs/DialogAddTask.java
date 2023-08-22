package co.edu.uptc.view.Dialogs;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

import co.edu.uptc.view.Custom.CustomButton;

public class DialogAddTask extends JDialog {
    private JLabel labelName;
    private JTextArea textAreaName;
    private JLabel labelDescription;
    private JTextArea textAreaDescription;
    private JLabel labelDate;
    private JTextArea textAreaDate;
    private CustomButton complete;

    public DialogAddTask(ActionListener listener) {
        setSize(500, 420);
        setLayout(new GridBagLayout());
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
        labelDescription = new JLabel("Descripcion: ");
        add(labelDescription, gbc);

        gbc.gridy = 3;
        textAreaDescription = new JTextArea();
        textAreaDescription.setPreferredSize(new Dimension(200, 100));
        add(textAreaDescription, gbc);

        gbc.gridy = 4;
        labelDate = new JLabel("Fecha: ");
        add(labelDate, gbc);

        gbc.gridy = 5;
        textAreaDate = new JTextArea();
        textAreaDate.setPreferredSize(new Dimension(200, 30));
        add(textAreaDate, gbc);

        gbc.gridy = 6;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        complete = new CustomButton("complete");
        complete.addActionListener(listener);
        complete.setActionCommand("complete");
        add(complete, gbc);
    }

    public String getName() {
        return textAreaName.getText();
    }

    public String getDescription() {
        return textAreaDescription.getText();
    }

    public String getDate() {
        return textAreaDate.getText();
    }
}
