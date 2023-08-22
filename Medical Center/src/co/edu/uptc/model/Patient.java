package co.edu.uptc.model;

public class Patient {

    private String name;
    private int severity_level;

    public Patient(String name, int severity_level) {
        this.name = name;
        this.severity_level = severity_level;
    }

    public String getName() {
        return name;
    }

    public int getSeverity_level() {
        return severity_level;
    }

}
