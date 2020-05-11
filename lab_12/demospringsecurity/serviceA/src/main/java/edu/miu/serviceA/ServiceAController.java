package edu.miu.serviceA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @Autowired
    OAuth2RestTemplate oAuth2RestTemplate;

    @GetMapping("/product")
    public  Product getProduct(){
        Product product= new Product();
        product.setName(" enjera ");
        Contact contact =oAuth2RestTemplate.getForObject("http://localhost:9000/contact",Contact.class);
        product.setContact(contact.getPhone());
        return product;
    }
    @GetMapping("/salary")
    public double getSalary(){
        return  oAuth2RestTemplate.getForObject("http://localhost:9010/salary",Double.class);
    }

}
