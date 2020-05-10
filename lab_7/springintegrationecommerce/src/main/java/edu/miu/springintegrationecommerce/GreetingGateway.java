package edu.miu.springintegrationecommerce;

import edu.miu.springintegrationecommerce.model.Order;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway
public interface GreetingGateway {

	@Gateway(requestChannel = "inputChannel" ,replyTimeout = 0 ,requestTimeoutExpression = " failed")
    String handleRequest(Message<Order> message);
}
