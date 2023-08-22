package co.edu.uptc.view.Custom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class CustomPanel extends JPanel {
    private static final int MAX_COLUMNS = 3;
    private JPanel panel1;
    private String taskName;

    public CustomPanel(String type) {
        setLayout(new GridLayout(0, MAX_COLUMNS, 50, 50));
        this.taskName = type;
        initComponents();
    }

    private void initComponents() {
        panel1 = new JPanel(new BorderLayout());
    }

    public void setTasks(String[] information, MouseAdapter mouseAdapter) {
        removeAll();
        for (int i = 0; i < information.length; i++) {
            panel1 = new JPanel(new BorderLayout());
            JLabel label1 = new JLabel("");
            label1.setOpaque(true);
            if (this.taskName.equals("task")) {
                label1.setBackground(getRandomColor());
            } else {
                ImageIcon imageIcon = new ImageIcon("resources/icon.png");
                label1.setIcon(imageIcon);
            }
            panel1.add(label1, BorderLayout.CENTER);

            panel1.add(initButton(information[i], mouseAdapter), BorderLayout.SOUTH);

            add(panel1);
        }
        add(new Panel());
        add(new Panel());
        add(new Panel());
        add(new Panel());
        revalidate();
        repaint();
    }

    private Color getRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        return new Color(r, g, b);
    }

    private JButton initButton(String name, MouseAdapter mouseAdapter) {
        CustomButton button1 = new CustomButton(name);
        button1.setName(name + "," + taskName);
        button1.addMouseListener(mouseAdapter);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        return button1;
    }

    public String getTasktName() {
        return this.taskName;
    }
}