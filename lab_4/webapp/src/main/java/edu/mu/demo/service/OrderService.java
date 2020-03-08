package edu.mu.demo.service;

import edu.mu.demo.dao.OrderRepository;
import edu.mu.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order addOrder(Order order) {
        return orderRepository.insert(order);
    }

    public Order getOrder(Integer id) {
        return orderRepository.findById(id).get();
    }
}
