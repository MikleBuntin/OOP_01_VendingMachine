package org.example;

import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Product> goods = new ArrayList();

    public VendingMachine(ArrayList<Product> goods) {
        this.goods = goods;
    }
    public String toString(){
    String out = "";
    return out;
}

    public ArrayList<Product> getProductList() {
        return goods;
    }

    public Product GetProductByName (String name) {
        for (Product prod : goods){
            if (prod.getName().equals(name)) {
                return prod;
            }
        }
        return null;
    }
}
