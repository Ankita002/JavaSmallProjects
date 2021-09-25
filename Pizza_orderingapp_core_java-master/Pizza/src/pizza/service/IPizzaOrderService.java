package pizza.service;

import pizza.dao.PizzaException;
import pizza.dto.Customer;
import pizza.dto.PizzaOrder;

public interface IPizzaOrderService {
	public int placeOrder(Customer customer,PizzaOrder pizza) throws PizzaException;
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
}
