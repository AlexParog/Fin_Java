package com.company;

import java.util.ArrayList;

public class Orders {
    float ordSum;
    ArrayList<Menu> ords= new ArrayList<>();
     boolean isIt = true;

    public void addOrd(String ord){
        if (Menu.hm_menu.containsKey(ord)){
            if (Menu.hm_menu.get(ord).amount == 0){
                Menu.stopList.put(ord, Menu.hm_menu.get(ord));
                System.out.println(!isIt);
            } else{
                Menu.hm_menu.get(ord).setAmount(Menu.hm_menu.get(ord).amount + 1);
                setOrderSum(Menu.hm_menu.get(ord).price);
                ords.add(Menu.hm_menu.get(ord));
                System.out.println(isIt);
            }
        }else
            System.out.println(!isIt);
    }

    public void setOrderSum(double orderSum){
        this.ordSum += ordSum;
    }

    public float getOrdSum(){
        return ordSum;
    }
}
