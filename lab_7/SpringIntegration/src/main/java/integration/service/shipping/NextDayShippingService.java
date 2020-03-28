package integration.service.shipping;

import integration.model.Order;

public class NextDayShippingService {
    public String receiveOrder(Order order){
        System.out.println("NextDayShipping Service :: " +order);
        return "NextDayShippingService";
    }
}
