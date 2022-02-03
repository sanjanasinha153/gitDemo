package com.sanjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanjana.myclasses.Laptop;

@SpringBootApplication
public class FirstSpringbasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstSpringbasicsApplication.class, args);
		Laptop appleI80 = context.getBean(Laptop.class);
		appleI80.setBrandName("Apple");
		appleI80.setHeight(100);
		System.out.println(appleI80.toString());  //toString method is a built-in method of java.lang which
												  //returns string representation of an object
//		System.out.println(appleI80);
	}

}
