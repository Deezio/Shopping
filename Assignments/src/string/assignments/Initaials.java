package string.assignments;

import java.util.Scanner;

public class Initaials {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your name with initials");
		String name=sc.nextLine();
		String initials[]=name.split("[ ,.]");
		System.out.print(name+" your intials are: ");
		for(String i:initials) {
			if(i.length()==1)
			System.out.print(i+" ");
		}
		
	}
}
