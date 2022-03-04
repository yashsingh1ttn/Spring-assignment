package com.bootcamp.LooseCoupling;

import com.bootcamp.LooseCoupling.component.Restaurant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(LooseCouplingApplication.class, args);
		Restaurant restaurant = applicationContext.getBean(Restaurant.class);
		System.out.println(applicationContext.getBean(Restaurant.class) );
		restaurant.getHotDrink().prepareHotDrink();
	}

}
