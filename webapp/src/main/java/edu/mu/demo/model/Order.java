package edu.mu.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Order {
    @Id
    private Integer orderId;
    private ShoppingCart shoppingCart;
    private Address billing;
    private Address shipping;
    private CreditCard creditCard;

}
