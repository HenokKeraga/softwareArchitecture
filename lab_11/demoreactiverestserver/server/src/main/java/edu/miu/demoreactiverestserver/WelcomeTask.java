package edu.miu.demoreactiverestserver;

import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.awt.*;
import java.text.DateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Supplier;

@RestController
public class WelcomeTask {

    @GetMapping(value = "/",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @Scheduled(fixedRate = 1000)
    public Flux<String> welcome(){


        return Flux.just("A","B","C","D").delayElements(Duration.ofSeconds(1));
    }


    public String getDateString(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat=DateFormat.getTimeInstance(DateFormat.DEFAULT);

        String currentTime=dateFormat.format(date);
        System.out.println(currentTime);
        return  currentTime;
    }
}
