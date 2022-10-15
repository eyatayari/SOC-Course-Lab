package app.eni.service_product;

import app.eni.service_product.entities.product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import app.eni.service_product.repositories.productRepository;

import java.util.List;

@SpringBootApplication
public class ServiceProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProductApplication.class, args);
    }


    public CommandLineRunner start(productRepository productRepo){
        return args ->{
            productRepo.save(new product("prod1","cookies",1.5,4));
            productRepo.save(new product("prod2","lait",2.0,10));
            List<product> allProduct = productRepo.findAll();
            System.out.println("all prod"+ allProduct);
        };
    }
}
