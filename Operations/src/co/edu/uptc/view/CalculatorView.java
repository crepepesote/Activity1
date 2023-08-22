package co.edu.uptc.view;

public interface CalculatorView {
    String getInput();

    void displayResult(String result);

    void displayError(String errorMessage);
}
