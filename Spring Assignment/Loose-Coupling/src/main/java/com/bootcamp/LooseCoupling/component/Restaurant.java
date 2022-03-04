package com.bootcamp.LooseCoupling.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    @Autowired
    HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}

