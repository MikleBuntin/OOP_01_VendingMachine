package org.example;

public class Product {
    private String name;
    private Float price;
    Product(String name, Float price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public Float getPrice(){
        return price;
    }
}
