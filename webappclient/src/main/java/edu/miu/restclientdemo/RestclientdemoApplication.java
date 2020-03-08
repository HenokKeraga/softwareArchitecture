package edu.miu.restclientdemo;

import edu.miu.restclientdemo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@SpringBootApplication

public class RestclientdemoApplication implements CommandLineRunner {
    @Autowired
    private RestTemplate restTemplate;

    public static void main(String[] args) {
        SpringApplication.run(RestclientdemoApplication.class, args);
    }
    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        return  restTemplate;
    }
    @Override
    public void run(String... args) throws Exception{
        System.out.println(" In run method ");
        Product product1= new Product();
        addProduct(product1);
        Product product2= new Product();
        addProduct(product2);
        addProductInShoppingCart(product1,3);
        addProductInShoppingCart(product2,2);
        ShoppingCart shoppingCart=getShoppingCart(1);

        Order order= new Order(1,shoppingCart,new Address(),new Address(),new CreditCard());
        addOrder(order);
        getOrder(1);
        System.out.println("Exiting run method ");
    }

    public void addProduct(Product product){

        String url="http://localhost:8080/product/add";

       Product product1= restTemplate.postForObject(url,product,Product.class);
        System.out.println(" The added product is :::"+product1);
    }


    public void  addProductInShoppingCart(Product product,Integer quantity){

        String url="http://localhost:8080/cart/add";
        ShoppingCart shoppingCart= new ShoppingCart();
        shoppingCart.setItems(new ArrayList());
        shoppingCart.getItems().get(0).setProduct(product);
        shoppingCart.getItems().get(0).setQuantity(quantity);

        ShoppingCart shoppingCart1= restTemplate.postForObject(url,shoppingCart,ShoppingCart.class);
        System.out.println(" The added product is :::"+shoppingCart1);

    }
    public  ShoppingCart getShoppingCart(Integer id){
        String url="http://localhost:8080/cart/"+id;
        return  restTemplate.getForObject(url,ShoppingCart.class);
    }
    public  void addOrder(Order order){
        String url="http://localhost:8080/order/add";
        Order order1=restTemplate.postForObject(url,order,Order.class);
        System.out.println("Order :::"+order1);
    }
    public void getOrder(Integer id){
        String url="\"http://localhost:8080/order/"+id;
        Order order=restTemplate.getForObject(url,Order.class);
        System.out.println("The order is  :::"+order);

    }

}
