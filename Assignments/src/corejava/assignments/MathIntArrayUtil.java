package corejava.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MathIntArrayUtil {

	public static void main(String[] args) {

		int arr[]=getRandomAray();
		System.out.println("Random array before Sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nRandom array after Sorting");
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}
	public static int[] getRandomAray()
	{
		int index=9;
		int arr[]=new int[10];
		while (index>=0) {
			arr[index]=(int)(Math.random()*101);
			index--;
		}
		return arr;
	}
}
