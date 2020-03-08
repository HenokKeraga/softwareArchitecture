package edu.mu.demo.controller;

import edu.mu.demo.model.Stock;
import edu.mu.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("/stock/add")
    public ResponseEntity<Stock> addStoke(@RequestBody Stock stock){

        return new ResponseEntity<>(stockService.addStoke(stock), HttpStatus.OK);
    }
}
