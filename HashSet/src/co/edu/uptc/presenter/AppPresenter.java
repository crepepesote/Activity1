package co.edu.uptc.presenter;

import co.edu.uptc.model.Model;
import co.edu.uptc.view.ConsoleIO;

public class AppPresenter {
    private Model model;
    private ConsoleIO consoleIO;

    public AppPresenter(Model model, ConsoleIO consoleIO) {
        this.model = model;
        this.consoleIO = consoleIO;
    }

    public void start() {
        int digitCount = consoleIO.readInt("Ingrese la cantidad de dígitos: ");

        for (int i = 0; i < digitCount; i++) {
            int digit = consoleIO.readInt("Ingrese el dígito " + (i + 1) + ": ");
            model.addSet(digit);
        }

        model.generatePowerSet();
        String values = model.showAllValues();
        consoleIO.displayMessageLine("Conjunto de subconjuntos:");
        consoleIO.displayMessage(values);

        consoleIO.close();
    }

    public static void main(String[] args) {
        Model model = new Model();
        ConsoleIO consoleIO = new ConsoleIO();
        AppPresenter presenter = new AppPresenter(model, consoleIO);
        presenter.start();
    }
}
