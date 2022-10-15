package eni.app.inventoryservice;

import eni.app.inventoryservice.Entities.Product;
import eni.app.inventoryservice.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(ProductRepository prodRepo){
		return args -> {
			prodRepo.save(new Product(null,"computer DeskTop HP",900));
			prodRepo.save(new Product(null,"Printer Epson",80));
		  prodRepo.save(new Product(null,"MacBook Pro Lap Top",1800));
		  prodRepo.findAll().forEach(System.out::println);

		};
}
}
