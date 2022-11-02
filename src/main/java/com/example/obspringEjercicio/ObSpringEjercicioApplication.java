package com.example.obspringEjercicio;

import com.example.obspringEjercicio.entities.Laptop;
import com.example.obspringEjercicio.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjercicioApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringEjercicioApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		if(repository.count() == 0) {
			Laptop AsusX515 = new Laptop(null, "Asus", "X515", "8GB", "1TB");
			Laptop LenovoYoga = new Laptop(null, "Lenovo", "ThinkPad X1  Yoga G7", "16GB", "SSD 512");

			repository.save(AsusX515);
			repository.save(LenovoYoga);
		}
	}

}
