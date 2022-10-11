package app.eni.service_customer.Repositories;

import app.eni.service_customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}

@Projection(name = "fullCustomer",types =  Customer.class)
interface CustomerProjection extends Projection {
    public Long getId();

    public String getName();

    public String getEmail();
}

