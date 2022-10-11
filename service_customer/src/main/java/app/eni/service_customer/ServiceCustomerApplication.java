package app.eni.service_customer;

import app.eni.service_customer.Repositories.CustomerRepository;
import app.eni.service_customer.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCustomerApplication.class, args);
	}


	CommandLineRunner start(CustomerRepository customerRepo){
		return args -> {
			customerRepo.save(new Customer(null,"Enset","contact@enseyy-media.ma"));
		customerRepo.save(new Customer(null,"FSTM","contact@fstm.ma"));
			customerRepo.save(new Customer(null,"ENSAM","contact@ensam.ma"));
			customerRepo.findAll().forEach(System.out::println);

		};
	}
}
