package integration.service.shipping;

import integration.model.Order;

public class ShippingService {

    public String receiveOrder(Order order){
        System.out.println("Shipping Service :: " +order);
        return "shipping Service";
    }
}
