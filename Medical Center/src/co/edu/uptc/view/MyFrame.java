package co.edu.uptc.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import co.edu.uptc.view.Custom.CustomButton;
import co.edu.uptc.view.Custom.CustomJList;

public class MyFrame extends JFrame {
    private CustomButton addPatient;
    private CustomButton attendPatient;
    private CustomJList patients;
    private DialogAddPatient dialogAddPatient;

    public MyFrame(String[] patients, ActionListener listener) {
        this.setTitle("Medical Center");
        this.setSize(600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents(patients, listener);
        this.setVisible(true);
    }

    private void initComponents(String[] patients, ActionListener listener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        addPatient = new CustomButton("Add Patient");
        addPatient.setActionCommand("addPatient");
        addPatient.addActionListener(listener);
        add(addPatient, gbc);

        gbc.gridx = 1;
        attendPatient = new CustomButton("Attend Patient");
        attendPatient.setActionCommand("attendPatient");
        attendPatient.addActionListener(listener);
        add(attendPatient, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.weighty = 1.0; // Distribuir espacio vertical hacia abajo
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        this.patients = new CustomJList();
        this.patients.setListData(patients);
        add(this.patients, gbc);
    }

    public void setPatients(String[] patients) {
        this.patients.setListData(patients);
    }

    public void showDialog(ActionListener listener) {
        this.dialogAddPatient = new DialogAddPatient(listener);
    }

    public String getName() {
        return this.dialogAddPatient.getNamePatient();
    }

    public int getSeverity_level() {
        return this.dialogAddPatient.getSeverity_level();
    }

    public void closeDialog() {
        this.dialogAddPatient.dispose();
    }

}
