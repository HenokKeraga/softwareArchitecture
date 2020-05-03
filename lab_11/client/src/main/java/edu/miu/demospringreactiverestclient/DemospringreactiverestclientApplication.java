package edu.miu.demospringreactiverestclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

@SpringBootApplication
public class DemospringreactiverestclientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemospringreactiverestclientApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Flux<String> result =
                WebClient.create("http://localhost:9010").get().retrieve().bodyToFlux(String.class);
        Consumer<String> consumer=(s)-> System.out.println(s);
        result.subscribe(consumer);


    }
}
