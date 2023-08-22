package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import co.edu.uptc.view.Custom.CustomButton;

public class DialogAddPatient extends JDialog {
    private JLabel name;
    private JTextArea nameArea;
    private JLabel severity_level;
    private JTextArea severity_levelArea;
    private CustomButton add;

    public DialogAddPatient(ActionListener listener) {
        setSize(300, 300);
        setLayout(new GridBagLayout()); // Cambiar el layout a GridBagLayout
        initComponents(listener);
        setVisible(true);
    }

    private void initComponents(ActionListener listener) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        name = new JLabel("Name");
        add(name, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        nameArea = new JTextArea();
        nameArea.setPreferredSize(new Dimension(150, 30));
        add(nameArea, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        severity_level = new JLabel("Severity Level");
        add(severity_level, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        severity_levelArea = new JTextArea();
        severity_levelArea.setPreferredSize(new Dimension(150, 30));
        add(severity_levelArea, gbc);

        gbc.gridy = 2;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add = new CustomButton("Add");
        add.addActionListener(listener);
        add.setActionCommand("add");
        add(add, gbc);
    }

    public String getNamePatient() {
        return nameArea.getText();
    }

    public int getSeverity_level() {
        return Integer.parseInt(severity_levelArea.getText());
    }
}