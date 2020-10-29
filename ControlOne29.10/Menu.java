package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

 public class Menu {
    String ord;
    float price;
    int amount;
    HashSet<String> ingredients;
    static HashMap<String, Menu> stopList = new HashMap<>();
    static ArrayList<Menu> list_menu = new ArrayList<>();
    static HashMap<String,Menu> hm_menu = new HashMap<>();

    public String Printable() {
      return "Меню{" + "Название заказа: "+ ord + ", Цена" + price + ", Количество"
              + amount + ", Ингредиенты" + ingredients + "}";
    }

    public void setOrd(String ord){
        this.ord = ord;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setIngredients(HashSet<String> ingredients){
        this.ingredients = ingredients;
    }

    public static void addAmount(String ord, int amount){
        if (Menu.hm_menu.containsKey(ord)){
            Menu.hm_menu.get(ord).setAmount(Menu.hm_menu.get(ord).amount + amount);
            Menu.stopList.remove(ord);
        }
    }

    public static void printMenu(){
        for (Menu obj: list_menu){
            System.out.println(obj.toString());
        }
    }

    public static void printStopList(){
        for (String obj: stopList.keySet()){
            System.out.println(stopList.get(obj).toString());
        }
    }
 }
