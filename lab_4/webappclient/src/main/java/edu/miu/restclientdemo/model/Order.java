package edu.miu.restclientdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    private Integer orderId;
    private ShoppingCart shoppingCart;
    private Address billing;
    private Address shipping;
    private CreditCard creditCard;

}
