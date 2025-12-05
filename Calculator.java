/**
 * 
 */
package exercises;

import java.util.Scanner;

/**
 * 
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("CALCULATOR - enter first of two whole numbers: ");
		int firstNum = scanner.nextInt();
		System.out.println();
		System.out.println("Enter 2nd of two whole numbers: ");
		int secondNum = scanner.nextInt();
		System.out.println("1 to add, 2 to subtract, 3 to multiply, 4 to divide: ");
		int action = scanner.nextInt();
		int answer = 0;
		switch(action) {
			case 1:
				answer = firstNum + secondNum;
				break;
			case 2:
				answer = firstNum - secondNum;
				break;
			case 3:
				answer = firstNum * secondNum;
				break;
			case 4:
				if (secondNum == 0) {
					System.out.println("Cannot divide by zero, exiting.");
					scanner.close();
					return;					
				} else {
					answer = firstNum / secondNum;
					break;
				}
			default:
				System.out.println(action + " is not a valid selection, exiting.");
				scanner.close();
				return;

		}
		System.out.println("Answer: " + answer);
		scanner.close();
			
	}

}

;


