package com.bootcamp.TightCoupling.component;

import org.springframework.stereotype.Component;

@Component
public class ExpressTea {
    public void prepareHotDrink(){
        HotDrink hotDrink = new HotDrink();
        hotDrink.prepareHotDrink();
        System.out.println("Preparing Express Tea");
    }


}
