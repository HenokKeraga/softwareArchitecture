package integration.service.shipping;

import integration.model.Order;

public class ShippingServiceFilter {

    public boolean checkAmount(Order order){
        return order.getAmount()>175;
    }
}
