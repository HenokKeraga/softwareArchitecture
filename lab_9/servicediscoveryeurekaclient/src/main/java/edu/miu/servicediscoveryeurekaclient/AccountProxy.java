package edu.miu.servicediscoveryeurekaclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name = "accountservice",url = "http://localhost:9010")
@FeignClient(name = "accountservice")
@RibbonClient(name = "")
public interface AccountProxy {

    @GetMapping("/account")
    public  String getAccount();

}
