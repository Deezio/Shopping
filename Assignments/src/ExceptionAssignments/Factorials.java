package ExceptionAssignments;

import java.util.Scanner;

public class Factorials {
	public static void main(String args[])
	{
		String keepGoing="Y";
		Scanner s=new Scanner(System.in);
		while(keepGoing.equals("Y")||keepGoing.equals("y")) 
		{
			try {
			System.out.println("Enter an Integer");
			int val=s.nextInt();
			System.out.println("factorial("+val+") ="+MathUtil.factorial(val));
			}catch(Exception e) {
				System.out.println("Caught in Main Class: "+e);
			}
			finally {
				System.out.println("Do u wanna continue y/n");
				s.nextLine();
				keepGoing=s.nextLine();
			}
		}
		System.out.print("Thank you for Using ");
	}
}
