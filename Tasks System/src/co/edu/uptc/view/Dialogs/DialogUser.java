package co.edu.uptc.view.Dialogs;

import java.awt.Dialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogUser extends JDialog {
    private JLabel userName;
    private JComboBox<String> taskAssignment;

    public DialogUser(String name, String[] information) {
        super(null, Dialog.ModalityType.APPLICATION_MODAL);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        initComponents(name, information);
        setVisible(true);
    }

    private void initComponents(String name, String[] information) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new java.awt.Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        userName = new JLabel("Usuario =  " + name);
        add(userName, gbc);

        gbc.gridy = 1;
        taskAssignment = new JComboBox<>(information);
        add(taskAssignment, gbc);
    }

}
