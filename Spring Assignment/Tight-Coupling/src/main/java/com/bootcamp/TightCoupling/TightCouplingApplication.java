package com.bootcamp.TightCoupling;

import com.bootcamp.TightCoupling.component.ExpressTea;
import com.bootcamp.TightCoupling.component.HotDrink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TightCouplingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext= SpringApplication.run(TightCouplingApplication.class, args);
		HotDrink hotDrink = applicationContext.getBean(HotDrink.class);
		applicationContext.getBean(ExpressTea.class).prepareHotDrink();
	}

}
