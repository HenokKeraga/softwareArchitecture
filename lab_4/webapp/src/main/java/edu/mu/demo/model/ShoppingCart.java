package edu.mu.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class ShoppingCart {
    @Id
    private Integer shoppingCartId;
    private List<Item> items;
}
