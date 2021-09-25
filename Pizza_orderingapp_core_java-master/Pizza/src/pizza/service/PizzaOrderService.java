package pizza.service;

import pizza.dao.PizzaException;
import pizza.dao.PizzaOrderDao;
import pizza.dto.Customer;
import pizza.dto.PizzaOrder;

public class PizzaOrderService implements IPizzaOrderService{
PizzaOrderDao dao=new PizzaOrderDao();
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza)
			throws PizzaException {
		// TODO Auto-generated method stub
		return dao.placeOrder(customer, pizza);
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		// TODO Auto-generated method stub
		return dao.getOrderDetails(orderid);
	}

}
