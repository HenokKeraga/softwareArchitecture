package integration;

public class ShippingService {
	public void ship(Order order) {
		System.out.println("shipping: "+ order.toString());
	}
}
