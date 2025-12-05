package projects;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to print its multiplcation table: ");
		int beginNumber = scanner.nextInt();
		System.out.println("Enter how many numbers to print out: ");
		int endNumber = scanner.nextInt();
		System.out.println("Multiplication Table for " + beginNumber + ":");
		for(int i = 0; i <=endNumber; i++) {
			int result = beginNumber* i;
			System.out.println(beginNumber + " x " + i + " = " + result);
		}
		

	}

}
