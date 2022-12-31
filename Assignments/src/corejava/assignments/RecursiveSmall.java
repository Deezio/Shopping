
package corejava.assignments;

import java.util.Scanner;

public class RecursiveSmall {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of elements in the array");
		int arrlen = sc.nextInt();
		
		int arr[] = new int[arrlen];
		
		System.out.println("Enter the array elements");
		
		for (int index = 0; index < arrlen; index++)
			arr[index] = sc.nextInt();
		
		int small=recursiveSmall(arr,Integer.MAX_VALUE,arr.length-1);
		
		System.out.println("The Smallest no in the array is : "+small);
	}

	private static int recursiveSmall(int[] arr, int minValue, int length) {
		// TODO Auto-generated method stub
		if(length>=0 && minValue>arr[length]) {
			minValue=(arr[length]<minValue)?arr[length]:minValue;//terenary operator
			minValue=recursiveSmall(arr,minValue,length-1);
			return minValue;
		}
		else
		{
			return minValue;
		}
	
		
	}
}
