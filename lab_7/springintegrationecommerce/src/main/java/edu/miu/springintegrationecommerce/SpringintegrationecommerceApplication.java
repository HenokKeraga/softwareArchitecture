package edu.miu.springintegrationecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class SpringintegrationecommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringintegrationecommerceApplication.class, args);
    }

}
