package edu.mu.demo.dao;

import edu.mu.demo.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StokeRepository extends MongoRepository<Stock,Integer> {
}
