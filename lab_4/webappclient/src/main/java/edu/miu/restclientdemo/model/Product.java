package edu.miu.restclientdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Integer productNumber;
    private String name;
    private double price;
    private String description;
    private List<Review> reviews;
    private Supplier supplier;
    private Stock stock;
}
