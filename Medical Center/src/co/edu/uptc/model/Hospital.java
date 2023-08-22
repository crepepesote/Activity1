package co.edu.uptc.model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Hospital {

    private PriorityQueue<Patient> patients;

    public Hospital() {
        this.patients = new PriorityQueue<Patient>(comparator);
    }

    public void addPatient(String name, int severity_level) {
        this.patients.add(new Patient(name, severity_level));
    }

    public void attendPatient() {
        this.patients.poll();
    }

    public String[] patients() {
        PriorityQueue copy = new PriorityQueue<Patient>(comparator);
        copy.addAll(this.patients);
        String bag = "";
        while (!copy.isEmpty()) {
            Patient patient = (Patient) copy.poll();
            bag += patient.getName() + ",";
        }
        return bag.split(",");
    }

    Comparator<Patient> comparator = new Comparator<Patient>() {
        @Override
        public int compare(Patient o1, Patient o2) {
            if (o1.getSeverity_level() > o2.getSeverity_level()) {
                return -1;
            } else if (o1.getSeverity_level() < o2.getSeverity_level()) {
                return 1;
            }
            return 0;
        }
    };

}
