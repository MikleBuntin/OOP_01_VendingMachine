package org.example;

import java.util.ArrayList;

public class VendingMachine {
    protected ArrayList<Product> goods = new ArrayList();

    public VendingMachine(ArrayList<Product> goods) {
        this.goods = goods;
    }
    public void AddProduct(Product prod){
        goods.add(prod);
    }
    public String toString(){
    String out = "";
    return out;
}

    public ArrayList<Product> getProductList() {
        return goods;
    }
    public void printProductList() {
        for (Product pr : goods){
            System.out.println(pr.toString());;
        }
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
