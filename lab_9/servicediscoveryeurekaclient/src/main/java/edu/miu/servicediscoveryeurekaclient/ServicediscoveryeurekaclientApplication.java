package edu.miu.servicediscoveryeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients("edu.miu.servicediscoveryeurekaclient")
public class ServicediscoveryeurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicediscoveryeurekaclientApplication.class, args);
    }

}
