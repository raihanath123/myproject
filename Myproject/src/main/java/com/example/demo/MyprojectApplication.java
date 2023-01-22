package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(MyprojectApplication.class, args);
		//Inmakes l1=new Inmakes();
		Inmakes l1=cont.getBean(Inmakes.class);
		l1.show();
		
		
	}  

}
