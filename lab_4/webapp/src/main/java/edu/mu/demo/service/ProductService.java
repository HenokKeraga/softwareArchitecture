package edu.mu.demo.service;

import edu.mu.demo.dao.ProductRepository;
import edu.mu.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
       productRepository.insert(product);

        return productRepository.findById(product.getProductNumber()).get();
    }

    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }
}
