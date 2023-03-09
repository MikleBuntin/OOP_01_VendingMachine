package org.example;

import java.util.ArrayList;

public class VendingMachine {
//private Product product;
private ArrayList<Product> productList = new ArrayList();

public String toString(){
    String str = "";
    return str;
}

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public String GetProductForName (String name) {
    for (Product prod : productList){
        if (prod.getName().equals(name)) {
//            System.out.println(prod.getName() + prod.getPrice());
            return prod.toString();
        }
    }
}
}
