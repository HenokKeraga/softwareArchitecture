package edu.miu.springintegrationecommerce;

import edu.miu.springintegrationecommerce.model.DomesticOrder;
import edu.miu.springintegrationecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	private GreetingGateway gateway;
	
	@RequestMapping(value="" ,method = RequestMethod.POST)
	public String getGreeting(@RequestBody Order order) {

		Message<Order> orderMessage =  MessageBuilder.withPayload(order).build();

		String result=gateway.handleRequest(orderMessage);
		return result;
	}

	@RequestMapping(value="" ,method = RequestMethod.GET)
	public DomesticOrder getOrder(){
		return  new DomesticOrder();
	}
}
