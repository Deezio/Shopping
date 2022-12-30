package ExceptionAssignments;

import java.util.Scanner;

public class ParseSum {

	public static void main(String[] args) {
		
		int val,sum=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a line of text");
		Scanner scanline=new Scanner(s.nextLine());
		
		while(scanline.hasNext()) {
			try {
			val=Integer.parseInt(scanline.next());
			sum+=val;
			}catch(NumberFormatException e) {
				sum+=0;
			}
		}
		System.out.print("the sum is "+sum);
	}

}
