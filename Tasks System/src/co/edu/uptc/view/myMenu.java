package co.edu.uptc.view;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.Custom.CustomButton;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;

public class myMenu extends JPanel {
    private JLabel title;
    private CustomButton tasks;
    private CustomButton users;
    private Image backgroundImage;

    public myMenu(ActionListener listener) {
        loadBackgroundImage();
        initComponents(listener);
    }

    private void loadBackgroundImage() {
        try {
            backgroundImage = ImageIO.read(
                    new File("resources/oficina-gc.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initComponents(ActionListener listener) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        title = new JLabel("Sistema de Tareas");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(CENTER_ALIGNMENT);

        tasks = new CustomButton("Tareas");
        tasks.setFont(new Font("Arial", Font.PLAIN, 18));
        tasks.setAlignmentX(CENTER_ALIGNMENT);
        tasks.setActionCommand("tasks");
        tasks.addActionListener(listener);

        users = new CustomButton("Usuarios");
        users.setActionCommand("users");
        users.addActionListener(listener);
        users.setFont(new Font("Arial", Font.PLAIN, 18));
        users.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(title);
        add(Box.createVerticalGlue());
        add(tasks);
        add(Box.createVerticalStrut(20));
        add(users);
        add(Box.createVerticalGlue());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (backgroundImage != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
