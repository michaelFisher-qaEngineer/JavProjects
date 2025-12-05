package exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Roshambo!");
		System.out.println("Enter your choice: ");
		System.out.println("Rock: 0, Paper: 1, Scissors: 2");
		int userChoice = scanner.nextInt();
		
		if(userChoice < 0 || userChoice > 2) {
			System.out.println(userChoice + " is an invalid choice, rerun program and try again.");
			scanner.close();
			return;
		}
		String userString = null;
		switch(userChoice) {
			case 0:
				userString = "Rock";
				break;
			case 1: 
				userString = "Paper";
				break;
			case 2:
				userString = "Scissors";
				break;
		}
			
		int computerChoice = new Random().nextInt(3);
		String computerString = null;
		switch(computerChoice) {
			case 0:
				computerString = "Rock";
				break;
			case 1:
				computerString = "Paper";
				break;
			case 2:
				computerString = "Scissors";
				break;
		}
		
		if(userChoice == computerChoice) {
			System.out.println("You and the computer both picked " + userString + " - DRAW!");
		} else if (
				(userChoice == 0 && computerChoice == 2) ||
				(userChoice == 1 && computerChoice == 0) ||
				(userChoice == 2 && computerChoice == 1)
				) {
			System.out.println("You picked " + userString + " and computer picked " + computerString + " - you win!");
		} else {
			System.out.println("You picked " + userString + " and computer picked " + computerString + " - computer wins, you lose!");
		}
		scanner.close();
		
	}

}


