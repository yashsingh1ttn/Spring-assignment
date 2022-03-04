package com.bootcamp.LooseCoupling.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink{

    public void prepareHotDrink() {
        System.out.println("Preparing Tea");
    }

}
