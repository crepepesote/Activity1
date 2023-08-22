package co.edu.uptc.model;

public class ShoppinCar {
    private Item[] items;

    public ShoppinCar() {
        this.items = new Item[0];
    }

    public void addItem(String name, int price) {
        Item[] copy = new Item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            copy[i] = items[i];
        }
        copy[copy.length - 1] = new Item(name, price);
        items = copy;
    }

    public String showShoppingCar() {
        String bag = "";
        for (int i = 0; i < items.length; i++) {
            bag += "Nombre: " + items[i].getName() + " Precio: " + items[i].getPrice() + "\n";
        }
        return bag;
    }

    public int totalPrice() {
        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
}
