
package integration;


public class WarehouseService {

	public Order checkStock(Order order) {
		System.out.println("WarehouseService: checking order "+order.toString());
		return order;
	}
}
