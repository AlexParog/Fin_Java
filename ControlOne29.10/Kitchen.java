package com.company;

import java.util.HashSet;

public class Kitchen extends Menu {
    public  Kitchen(String ord, float price, int amount, HashSet<String> ingredients){
        this.ord = ord;
        this.price = price;
        this. amount = amount;
        this.ingredients = ingredients;
        list_menu.add(this);
        hm_menu.put(ord, this);

        if (amount == 0)
            stopList.put(ord, this);

    }
}
