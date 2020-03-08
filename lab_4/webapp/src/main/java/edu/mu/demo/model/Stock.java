package edu.mu.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Stock {
    @Id
    private Integer stockId;
    private Integer amount;
    private String location;

}
