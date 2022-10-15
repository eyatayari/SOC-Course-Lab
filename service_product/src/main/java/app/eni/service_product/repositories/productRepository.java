package app.eni.service_product.repositories;

import app.eni.service_product.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product,String> {
}
