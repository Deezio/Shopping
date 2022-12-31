package corejava.assignments;

import java.util.Scanner;

public class RecursiveSamllNoIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number of elements in the array");
		int arrlen = sc.nextInt();

		int arr[] = new int[arrlen];

		System.out.println("Enter the array elements");

		for (int index = 0; index < arrlen; index++)
			arr[index] = sc.nextInt();

		int small = recursiveSmall(arr,arr.length-1,arr.length-1);

		System.out.println("The Smallest no in the array is in the index : " + small);
	}

	private static int recursiveSmall(int[] arr,int len,int minindex) {
		// TODO Auto-generated method stub
		if(len==0||arr[minindex]>arr[len]) {
			return len;
		}
		else
		{
			int ind=recursiveSmall(arr, len-1, minindex);
			if(arr[minindex]>arr[ind])
			{
				minindex=ind;
			}
			return minindex;
		}

	}

}
