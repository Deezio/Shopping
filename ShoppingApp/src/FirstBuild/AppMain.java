package FirstBuild;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
	public static void main(String args[])
	{
		Product prod1=new Product(1001L,"Iphone 4","Mobile",15000.00);
		Product prod2=new Product(1050L,"Biriyani","Food",150.00);
		List<Product> products=new ArrayList<Product>();
		products.add(prod1);
		products.add(prod2);
		
		Customer customer1=new Customer(1201L,"Deepak",1);
		
		Order order1=new Order(12L,"delivering",products,customer1);
		
		System.out.print(order1);
	}
}
