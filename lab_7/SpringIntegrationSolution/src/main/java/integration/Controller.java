package integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	private OrderGateway gateway;
	
	@RequestMapping("/processOrder")
	public String handeOrder() {
		Order order = new Order("123",200.50);
		Message<Order> orderMessage =  MessageBuilder.withPayload(order).build();
		gateway.handleRequest(orderMessage);
		return "OK";
	}
	
	@RequestMapping("/hi")
	public String handeOrder2() {

		return "HI";
	}
}
