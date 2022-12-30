package string.assignments;

import java.util.Scanner;

public class StringCheck {
	public static void main(String args[])
	{
		
		String text="";
		int flag=0;
		System.out.println("Enter any text");
		Scanner sc=new Scanner(System.in);
		text=sc.nextLine();
		for(char letter:text.toCharArray()) {
			if(Character.isDigit(letter))
				flag++;
		}
		if(flag==0) {
		System.out.print("It contains String only");
		}
		else {
			if(flag==text.length())
			{
				System.out.print("It contains Number only");
			}
			else {
				System.out.print("It contains both numbers and String");
			}
		}
	}
}
