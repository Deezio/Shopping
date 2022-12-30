package string.assignments;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String text=sc.nextLine();
		String iter="";
		//Iteration
		for(int index=text.length()-1;index>=0;index--)
		{
			iter+=text.charAt(index);
		}
		System.out.println("Using recursion Iteration Revrese: "+iter);
		String recursion=revrec(text,"",text.length()-1);
		System.out.print("Using Recuursion  "+recursion);
	}
	
	public static String revrec(String text,String ans,int len) {

		if(len<0)
			return ans;
		else {
			ans+=text.charAt(len);
			ans=revrec(text,ans,len-1);
			
		}
		return ans;
	}
}

