package edu.mu.demo.model;

import lombok.Data;

@Data
public class Customer {
    private int customerNumber;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Address address;
    private CreditCard creditCard;

}
