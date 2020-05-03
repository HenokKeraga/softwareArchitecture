package edu.miu.demoreactiverestserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoreactiverestserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoreactiverestserverApplication.class, args);
    }

}
