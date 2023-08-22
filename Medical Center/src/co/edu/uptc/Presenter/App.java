package co.edu.uptc.Presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.model.*;
import co.edu.uptc.view.MyFrame;

public class App implements ActionListener {
    private MyFrame view;
    private Hospital hospital;

    public App() {
        this.hospital = new Hospital();
        this.view = new MyFrame(hospital.patients(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        this.options(action);
    }

    private void options(String option) {
        switch (option) {
            case "addPatient":
                view.showDialog(this);
                break;
            case "attendPatient":
                this.hospital.attendPatient();
                this.view.setPatients(this.hospital.patients());
                break;
            case "add":
                this.hospital.addPatient(view.getName(), view.getSeverity_level());
                this.view.setPatients(this.hospital.patients());
                this.view.closeDialog();
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        new App();
    }
}
