package integration.service.warehouse;

import integration.model.Order;

public class WarehouseService {

    public String  receiveOrder(Order order){
        System.out.println( "WareHouse Service ::" + order);
        return  "WareHouse service";
    }

}
