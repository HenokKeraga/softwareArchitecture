package edu.miu.serviceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public  Contact getContact(){
        Contact contact = new Contact();
        contact.setPhone("123445677");
        return  contact;
    }
}
