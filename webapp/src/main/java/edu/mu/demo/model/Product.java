package edu.mu.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class Product {
    @Id
    private Integer productNumber;
    private String name;
    private double price;
    private String description;
    private List<Review> reviews;
    private Supplier supplier;
    private Stock stock;
}
