package integration.model;

public class Order {
    private long orderNumber;
    private double amount;

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", amount='" + amount + '\'' +
                '}';
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
