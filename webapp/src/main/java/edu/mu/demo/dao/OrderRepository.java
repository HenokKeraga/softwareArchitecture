package edu.mu.demo.dao;

import edu.mu.demo.model.Order;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository  extends MongoRepository<Order, Integer> {
}
