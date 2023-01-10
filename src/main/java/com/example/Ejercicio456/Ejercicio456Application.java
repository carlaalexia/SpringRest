package com.example.Ejercicio456;

import com.example.Ejercicio456.entities.Laptop;
import com.example.Ejercicio456.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class Ejercicio456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio456Application.class, args);
		LaptopRepository repository =  (LaptopRepository) context.getBean(LaptopRepository.class);

		repository.save(new Laptop(null, "Samsung", "Rosa", 8));
		repository.save((new Laptop(null, "VAIO", "Blanco", 16)));
	}

}
