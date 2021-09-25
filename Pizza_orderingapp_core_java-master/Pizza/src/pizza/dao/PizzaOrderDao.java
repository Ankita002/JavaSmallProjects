package pizza.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import pizza.dto.Customer;
import pizza.dto.PizzaOrder;

public class PizzaOrderDao implements IPizzaOrderDao{
Map<Customer, PizzaOrder> m=new HashMap<>();
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza)
			throws PizzaException {
		m.put(customer, pizza);
		// TODO Auto-generated method stub
		return pizza.getOrderId();
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		// TODO Auto-generated method stub
		Iterator<Entry<Customer,PizzaOrder>> it= m.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair=(Map.Entry)it.next();
			if(((PizzaOrder) pair.getValue()).getOrderId()==orderid){
				return (PizzaOrder)pair.getValue();
				
			}
		}
		return null;
	}

}
