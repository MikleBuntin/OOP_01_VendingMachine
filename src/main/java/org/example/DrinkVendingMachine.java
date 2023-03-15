package org.example;

import java.util.ArrayList;

public class DrinkVendingMachine extends VendingMachine{
    private ArrayList<Drink> drinkList;
    public DrinkVendingMachine(ArrayList<Product> goods) {
        super(goods);
        drinkList = new ArrayList<Drink>();
    }
    public void addDrink(Drink dr){
        drinkList.add(dr);
    }
    public Drink GetProductByName (String name) {
        for (Drink dr : drinkList){
            if (dr.getName().equals(name)) {
                return dr;
            }
        }
        return null;
    }
}
