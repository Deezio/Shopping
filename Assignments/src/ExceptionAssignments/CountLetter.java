package ExceptionAssignments;

import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count[] = new int[26];
		System.out.println("Enter a sentence");
		String phrase = scan.nextLine();
		phrase = phrase.toUpperCase();
		for (int i = 0; i < phrase.length(); i++) {
			try {
				count[phrase.charAt(i) - 'A']++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Not a letter '"+phrase.charAt(i)+"'");
			}
		}
		System.out.println();
		for (int i : count) {
			System.out.print(i + " ");
		}

	}

}
