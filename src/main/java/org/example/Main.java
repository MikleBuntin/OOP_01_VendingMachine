package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Shoco", 2.0);
        products.add(product1);
        product1 = new Product("Breaad", 1.0);
        products.add(product1);

        VendingMachine firstMashine = new VendingMachine(products);

        Product prod3 = new Product("Nuts", 1.5);
        firstMashine.AddProduct(prod3);

        firstMashine.AddProduct(new Product("Bounty", 1.2));

        Drink drink1 = new Drink("Milk", 2.7);
        drink1.setVolume(1.0);
        firstMashine.AddProduct(drink1);

        Drink drink2 = new Drink("Juice Orange", 2.5, 1.0);
        firstMashine.AddProduct(drink2);
        firstMashine.AddProduct(new Drink("Juice Apple", 1.8, 1.0));

        firstMashine.printProductList();

    }
}