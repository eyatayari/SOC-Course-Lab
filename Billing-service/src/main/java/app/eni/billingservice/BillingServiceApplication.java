package app.eni.billingservice;



import app.eni.billingservice.Entities.Bill;
import app.eni.billingservice.Entities.Customer;
import app.eni.billingservice.Entities.ProductItem;
import app.eni.billingservice.Repositories.BillRepository;
import app.eni.billingservice.Repositories.ProductItemRepository;
import app.eni.billingservice.Services.CustomerServiceClient;
import app.eni.billingservice.Services.InventoryServiceClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args); }
    @Bean
    CommandLineRunner start(BillRepository billRepository, ProductItemRepository productItemRepository,
                            InventoryServiceClient inventoryServiceClient, CustomerServiceClient customerServiceClient){
        return args -> {
            Bill bill=new Bill();  bill.setBillingDate(new Date());
            Customer customer=customerServiceClient.findCustomerById(1L);
            bill.setCustomerID(customer.getId());  billRepository.save(bill);  inventoryServiceClient.findAll().getContent().forEach(p->{
                productItemRepository.save(new ProductItem(null,null,p.getId(),p.getPrice(),(int)(1+Math.random()*1000),bill));
            });
        };
    }}

