package co.edu.uptc.view;

import java.util.Scanner;
import co.edu.uptc.Presenter.App;

public class ConsoleView {
    private Scanner scanner;
    private App presenter;

    public ConsoleView(App presenter) {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Agregar ítem");
            System.out.println("2. Mostrar carrito");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    System.out.print("Nombre del ítem: ");
                    String name = scanner.nextLine();
                    System.out.print("Precio: ");
                    int price = scanner.nextInt();
                    presenter.addItem(name, price);
                    break;
                case 2:
                    System.out.println("Carrito de compras:");
                    System.out.println(presenter.showShoppingCar());
                    break;
                case 3:
                    System.out.println("Total: " + presenter.totalPrice());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        System.out.println("Chao");
    }
}
