package string.assignments;

import java.util.Scanner;

public class Permutaions {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		String val=sc.nextLine();
		String ans="";
		permute(val,ans);
		System.out.print(ans);
		
	}
	
	static void permute(String val,String ans)
	{
		if(val.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
			for(int i=0;i<val.length();i++)
			{
				char c=val.charAt(i);
				String left=val.substring(0,i);
				String right=val.substring(i+1);
				String rest=left+right;
				permute(rest,ans+c);
				
			}
		}
}
