package edu.miu.serviceregistry_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregistryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceregistryEurekaApplication.class, args);
    }

}
