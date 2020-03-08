package edu.mu.demo.controller;

import edu.mu.demo.model.Order;
import edu.mu.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/order/add")
    public ResponseEntity<Order> addOrder(@RequestBody Order order){
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.OK);
    }
    @GetMapping("/order/{id}")
    public  ResponseEntity<Order> getOrder (@PathVariable("id") Integer id){
        return new ResponseEntity<>(orderService.getOrder(id),HttpStatus.OK);
    }
}
