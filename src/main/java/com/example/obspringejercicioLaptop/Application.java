package com.example.obspringejercicioLaptop;

import com.example.obspringejercicioLaptop.entities.Laptop;
import com.example.obspringejercicioLaptop.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop(null,"MacBook","Apple", 16.5, LocalDate.of(2019,3,20),true);
		Laptop laptop2 = new Laptop(null,"Xps 15","Dell", 14D, LocalDate.of(2020,4,10),true);

		ApplicationContext context =  SpringApplication.run(Application.class, args);
		context.getBean(LaptopRepository.class).save(laptop1);
		context.getBean(LaptopRepository.class).save(laptop2);



	}

}
