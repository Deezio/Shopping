package corejava.assignments;

import java.util.Scanner;

public class RecursiveSum {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number of elements in the array");
		int arrlen=sc.nextInt();
		int arr[]=new int[arrlen];
		System.out.println("Enter the array elements");
		for(int index=0;index<arrlen;index++)
			arr[index]=sc.nextInt();
		int sum=recursiveSum(arr,0,arr.length-1);
		System.out.println("The Sum of all elements in the array ="+sum);
	}
	
	public static int recursiveSum(int[] arr,int sum,int length)
	{
		if(length<1)
		{
			sum+=arr[length];
			return sum;
		}
		else {
			
			sum=recursiveSum(arr,sum,length-1);
			sum+=arr[length];
			return sum;
		}
		
	}
}
