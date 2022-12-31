package string.assignments; 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word and its anagram");
		String text1=sc.nextLine();
		String text2=sc.nextLine();
		
		//removing any and all white spaces
		String newtext1=text1.replaceAll(" ", "");
		String newtext2=text2.replaceAll(" ", "");
		
		//Checking if both of them have the length
		if(newtext1.length()!=newtext2.length())
		{
			System.out.println(text1+" is not  an anagram of "+text2);
			System.exit(0);
		}
		
		//pushing all characters of 1st text into a list
		List<Character> c=new ArrayList<>();
		for(Character ch:newtext1.toCharArray())
		{
			c.add(ch);
		}
		
		//popping of all the characters from the list which are matching in both the text file  
		for(Character ch:newtext2.toCharArray())
		{
			if(c.contains(ch))
			{
				c.remove(ch);
			}
			else {
				System.out.println(text1+" is not  an anagram of "+text2);
				System.exit(0);
			}
		}
		
		//if they both are anagram then there will be nothing left in the list as all the elements pushed in the 
		// beginning will be popped out
		
		System.out.println(text1+" is an anagram of "+text2);
	}
}

