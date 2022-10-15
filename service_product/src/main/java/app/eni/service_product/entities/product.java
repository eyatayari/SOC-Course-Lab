package app.eni.service_product.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class product {
    @Id
    private String id ;
    private String name;
    private Double price;
    private int quantity;


}
