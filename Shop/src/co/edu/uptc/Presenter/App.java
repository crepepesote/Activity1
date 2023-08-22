package co.edu.uptc.Presenter;

import co.edu.uptc.model.*;
import co.edu.uptc.view.*;

public class App {
    private ShoppinCar shoppingCart;
    private ConsoleView consoleView;

    public App() {
        this.shoppingCart = new ShoppinCar();
        this.consoleView = new ConsoleView(this);
        this.consoleView.start();
    }

    public void addItem(String name, int price) {
        shoppingCart.addItem(name, price);
    }

    public String showShoppingCar() {
        return shoppingCart.showShoppingCar();
    }

    public int totalPrice() {
        return shoppingCart.totalPrice();
    }

    public static void main(String[] args) {
        new App();
    }
}
