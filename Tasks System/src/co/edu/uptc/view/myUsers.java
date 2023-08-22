package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.*;

import co.edu.uptc.view.Custom.CustomButton;
import co.edu.uptc.view.Custom.CustomPanel;

public class myUsers extends JPanel {
    private CustomPanel panel1;
    private CustomButton back;

    public myUsers(ActionListener listener) {
        setLayout(new GridBagLayout());
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        back = new CustomButton("Back");
        back.addActionListener(listener);
        back.setActionCommand("back");
        add(back, gbc);

        gbc.gridy = 1;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel1 = new CustomPanel("users");
        add(panel1, gbc);
    }

    public void setUsers(String[] information, MouseAdapter mouseAdapter) {
        panel1.setTasks(information, mouseAdapter);
    }

    public String getPanelName() {
        return panel1.getName();
    }
}
