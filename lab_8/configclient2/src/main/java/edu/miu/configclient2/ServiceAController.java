package edu.miu.configclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

public class ServiceAController {


    @Value("${greeting}")
    private String message;

    @RequestMapping("/")
    public String getMessage(){
        return message;
    }

}
