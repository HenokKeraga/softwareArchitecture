package edu.mu.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Item {
    @Id
    private Integer itemId;
    private Product product;
    private int quantity;
}
