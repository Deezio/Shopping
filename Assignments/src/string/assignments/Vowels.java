package string.assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any text");
		
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		text=text.toUpperCase();
		int arr[]=new int[26];
		int vow[]= {(0),('E'-'A'),('I'-'A'),('O'-'A'),('U'-'A')};
		
		for(char i:text.toCharArray())
		{
			if(Character.isAlphabetic(i))
			{
				arr[i-'A']++;
			}
		}
		System.out.println("************Volwels********************");
		for(int i:vow) {
			if(arr[i]!=0)
			System.out.println((char)(i+'A')+" : "+arr[i]);
		}
		System.out.println("************Consanants********************");
		for(int i=0;i<26;i++)
		{
			if(arr[i]!=0)
			{
				if(i!=0&&(i!=('E'-'A')&& i!=('I'-'A')&& i!=('O'-'A')&& i!=('U'-'A'))) {
					System.out.println((char)(i+'A')+" : "+arr[i]);
				}
			}
		}
		
	}

}
