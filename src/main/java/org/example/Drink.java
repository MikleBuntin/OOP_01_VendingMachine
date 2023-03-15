package org.example;

public class Drink extends Product {
    private Double volume;
    Drink(String name, Double price) {
        super(name, price);
    }
    Drink(String name, Double price, Double volume){
        super(name, price);
        this.volume = volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }

    public Double getVolume(){
        return volume;
    }

    @Override
    public String toString() {
        String str = getName() + ", " + getVolume() + "l, " + getPrice().toString() + "р.";
        return str;
    }
}