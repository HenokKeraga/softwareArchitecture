package edu.mu.demo.controller;

import edu.mu.demo.model.Product;
import edu.mu.demo.model.Supplier;
import edu.mu.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){

        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") Integer id){



        return  new ResponseEntity<>(productService.getProduct(id),HttpStatus.OK);
    }

}
