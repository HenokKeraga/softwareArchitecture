package edu.mu.demo.dao;

import edu.mu.demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Integer> {
}
