package co.edu.uptc.view;

import java.util.Scanner;

public class ConsoleIO {
    private Scanner scanner;

    public ConsoleIO() {
        scanner = new Scanner(System.in);
    }

    public int readInt(String prompt) {
        displayMessage(prompt);
        return scanner.nextInt();
    }

    public void displayMessage(String message) {
        System.out.print(message);
    }

    public void displayMessageLine(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }
}
