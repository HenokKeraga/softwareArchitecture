package edu.miu.serviceC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

    @GetMapping("/salary")
    public double getSalary (){
        return 10.0;
    }
}
