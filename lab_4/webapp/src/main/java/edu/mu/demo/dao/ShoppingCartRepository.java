package edu.mu.demo.dao;

import edu.mu.demo.model.ShoppingCart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart,Integer> {
}
