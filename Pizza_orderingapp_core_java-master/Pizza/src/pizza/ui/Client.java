package pizza.ui;

import java.util.Scanner;

import pizza.dao.PizzaException;
import pizza.dto.Customer;
import pizza.dto.PizzaOrder;
import pizza.service.PizzaOrderService;

public class Client {
static PizzaOrderService ps=new PizzaOrderService();
	public static void main(String[] args) throws PizzaException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String pref="";
while(true){
	System.out.println("1.Place Order");
	System.out.println("2.Display Order");
	System.out.println("3.Exit");
	System.out.println("Enter choice: ");
	int ch=sc.nextInt();
	switch(ch){
	case 1:{
		System.out.println("Enter the name of the customer: ");
		String name=sc.next();
		System.out.println("Enter customer's address: ");
		String add=sc.next();
		System.out.println("Enter customer phone no: ");
		
		String phone=sc.next();
		System.out.println("Type of Pizza Topping preferred: ");
		pref=sc.next();
		double price=0;
		if(pref.equalsIgnoreCase("Capsicum")){
			price=350+30;
		}
		else if(pref.equalsIgnoreCase("Mushroom")){
			price=350+50;
		}
		else if(pref.equalsIgnoreCase("Jalapeno")){
			price=350+70;
		}
		else if(pref.equalsIgnoreCase("Paneer")){
			price=350+85;
		}
		System.out.println("Price to be calculated: Rs 350"+"+"+(price-350)+"("+pref+")="+price);
		System.out.println("Your Order has been placed with orderid: "+ ps.placeOrder(new Customer(name,add,phone),new PizzaOrder((int)(100+Math.random()*99),(int)(100+Math.random()*99),price)));
	break;
	}
	case 2:{
		System.out.println("Enter order id");
		int o=sc.nextInt();
		System.out.println(ps.getOrderDetails(o));
		break;
	}
	case 3:{
		System.exit(0);
	}
	
	
	
	
	}
	
	
	
}
	}

}
