package pizza.dao;

import pizza.dto.Customer;
import pizza.dto.PizzaOrder;

public interface IPizzaOrderDao {
public int placeOrder(Customer customer,PizzaOrder pizza) throws PizzaException;
public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
}
