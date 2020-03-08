package edu.mu.demo.service;

import edu.mu.demo.dao.StokeRepository;
import edu.mu.demo.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {
@Autowired
private StokeRepository stokeRepository;

    public Stock addStoke(Stock stock) {
        stokeRepository.insert(stock);
        return stokeRepository.findById(stock.getStockId()).get();
    }
}
