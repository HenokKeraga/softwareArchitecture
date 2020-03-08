package edu.mu.demo.model;

import lombok.Data;

import java.util.List;

@Data
public class Account {
    private String username;
    private String password;
    private Customer customer;
    private ShoppingCart shoppingCart;
    private List<Order> orderList;


}
