package pizza.dto;

public class PizzaOrder {
private int orderId;
private int customerId;
private double totalPrice;
private Customer customer;
 
 
public PizzaOrder(int orderId ,int customerId, double totalPrice
		) {
	super();
	this.orderId = orderId;
	this.customerId = customerId;
	this.totalPrice = totalPrice;
	 
}
@Override
public String toString() {
	return "PizzaOrder : OrderID " + orderId + " CustomerID " + customerId
			+ " Total Price " + totalPrice ;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

}
