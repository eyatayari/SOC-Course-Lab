package eni.app.inventoryservice.Repositories;

import eni.app.inventoryservice.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
