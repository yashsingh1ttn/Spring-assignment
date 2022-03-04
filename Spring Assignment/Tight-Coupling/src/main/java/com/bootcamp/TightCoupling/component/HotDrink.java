package com.bootcamp.TightCoupling.component;

import org.springframework.stereotype.Component;

@Component
public class HotDrink {
    public void prepareHotDrink() {
        System.out.println("Preparing Hot Drink");
    }
}
