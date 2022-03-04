package com.bootcamp.LooseCoupling.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class ExpressTea implements HotDrink{

    public void prepareHotDrink() {
        System.out.println("Preparing Express Tea");
    }
}
