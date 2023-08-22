package co.edu.uptc.view;

import java.util.Scanner;

public class ConsoleCalculatorView implements CalculatorView {

    private final Scanner scanner;

    public ConsoleCalculatorView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        System.out.print("Enter an expression: ");
        return scanner.nextLine();
    }

    @Override
    public void displayResult(String result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void displayError(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }
}
