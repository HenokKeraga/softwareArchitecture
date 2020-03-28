package edu.miu.springintegrationecommerce;


import edu.miu.springintegrationecommerce.model.DomesticOrder;
import edu.miu.springintegrationecommerce.model.Order;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway
public interface GreetingGateway {

	@Gateway(requestChannel = "inputChannel")
    String handleRequest(Message<Order> message);
}
