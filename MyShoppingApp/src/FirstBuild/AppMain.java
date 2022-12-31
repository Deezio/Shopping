package FirstBuild;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AppMain {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		//Products Details
		int noofprods;
		List<Product> products=new ArrayList<Product>();
		
		System.out.println("Enter no of products");
		noofprods=s.nextInt();
		
		for(int index=0;index<noofprods;index++)
		{
			System.out.print("\n****************Enter Product "+(index+1)+" Details **************\n");
			Product prod1=new Product();
			System.out.print("prod"+(index+1)+" Id: ");
			prod1.setId(s.nextLong());
			s.nextLine();
			System.out.print("prod"+(index+1)+"Name: ");
			prod1.setName(s.nextLine());
			System.out.print("prod"+(index+1)+"Category:");
			prod1.setCategory(s.nextLine());
			products.add(prod1);
			System.out.print("prod"+(index+1)+"Price: ");
			prod1.setPrice(s.nextDouble());
			
		}
		
		//Customer Details
		Customer customer=new Customer();
		
		System.out.print("\n****************Enter Customer Details  **************\n");
		System.out.print("Customer Id: ");
		customer.setId(s.nextLong());
		s.nextLine();
		System.out.print("Customer Name: ");
		customer.setName(s.nextLine());
		System.out.print("Customer Tier: ");
		customer.setTier(s.nextInt());
		
		//Order details
		Order order=new Order();
		
		System.out.print("\n****************Enter Order Details  **************\n");
		System.out.print("Order Id: ");
		order.setId(s.nextLong());
		s.nextLine();
		System.out.print("Order Status: ");
		order.setStatus(s.nextLine());
		order.setOrderDate(LocalDate.now());
		order.setDelivaryDate(LocalDate.now().plusDays(2));
		order.setProducts(products);
		order.setCustomer(customer);
		System.out.print(order);
	}
}
