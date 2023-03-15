package org.example;

public class HotDrink {
    private Double temp;

    HotDrink(String name, Double price, Double volume) {
        super(name, price, volume);
    }
    Drink(String name, Double price, Double volume){
        super(name, price);
        this.volume = volume;
    }
}
