package org.example;

public class Drink extends Product {
    private Double volume;
    Drink(String name, Double price) {
        super(name, price);
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
}
