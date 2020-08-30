/* Jason Vargas
 * Programming Fundamentals
 * Summer 2020
 * Program 4 - Set ADT
 */

import java.util.Scanner;

public class Test {

	private static Scanner scan;

	public static void main(String[] args) {
		Set testNode = new Set();

		System.out.println("Programming Fundamentals. \nNAME: Jason Vargas " + "\nPROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println("\nUse commands add x, del x, or exists x, where x is an integer.");

		String[] arr;
		for (;;) { //Infinite loop
			scan = new Scanner(System.in);
			System.out.print("Enter Command: ");
			// Create a string variable for user input and split it
			String input = scan.nextLine();
			arr = input.split(" ");
			int index = 0;
			String str = arr[index];
			index++;
			int x = Integer.parseInt(arr[index]);
			// If statements to handle each operation
			if (str.equals("add")) {
				testNode.add(x);
				System.out.println(testNode.toString());
			}
			if (str.equals("del")) {
				testNode.del(x);
				System.out.println(testNode.toString());
			}
			if (str.equals("exists")) {
				System.out.println(testNode.exists(x));
			}

		}
	}

}