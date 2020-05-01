package edu.miu.servicediscoveryeurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    AccountProxy proxy;

    @RequestMapping("/")
    public String getCustomer(){
        return  proxy.getAccount();
    }

}
