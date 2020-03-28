package integration;

import integration.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {
	@Autowired
	private GreetingGateway gateway;
	
	@RequestMapping(value="" ,method = RequestMethod.POST)
	public String getGreeting(@RequestBody Order order) {
		Message<Order> orderMessage =  MessageBuilder.withPayload(order).build();
		String result="";
		 result +=gateway.handleRequest(orderMessage);
		return result;
	}

	@RequestMapping(value="" ,method = RequestMethod.GET)
	public Order getOrder(){
		return  new Order();
	}
}
