package com.biswas.SpringBootDemo;

import com.biswas.SpringBootDemo.model.Alien;
import com.biswas.SpringBootDemo.model.Laptop;
import com.biswas.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

//		Alien obj = context.getBean(Alien.class);
//		obj.code();
	}

}
