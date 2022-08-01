package highRoller;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {

		// Welcome the user to the program
		System.out.println("Welcome to the high roller program:");

		// Declare integers to keep score of the winner
		int myWins = 0;
		int computerWins = 0;

		// Ask the user to roll their dice by hitting Enter
		//Use this as a space keeper between rounds
		System.out.println("Please roll your dice - Press Enter to roll");
		Scanner userDiceRollKeyboard = new Scanner(System.in);
		String blank = userDiceRollKeyboard.nextLine();

		for (int rounds = 0; rounds < 3; rounds++) {
			// Let the computer create a random number for the computer' turn to roll
			Random computerRoll = new Random();
			// The number is from 0 to 5 and it is only integers, less than 6
			int computerResult = computerRoll.nextInt(6);
			// Add 1 to make it a result from 1 to 6 - same as a dice
			computerResult++;
			
			// Let the computer create a random number for the user' turn to roll
			Random userDiceRollRandom = new Random();
			// The number is from 0 to 5 and it is only integers, less than 6
			int userDiceRoll = userDiceRollRandom.nextInt(6);
			// Add 1 to make it a result from 1 to 6 - same as a dice
			userDiceRoll++;

			// Display the result that the user have rolled
			System.out.println("You rolled a " + userDiceRoll);
			// Display the result that the computer has rolled
			System.out.println("The computer rolled a " + computerResult);

			// Display who has won the round and allocate a point to the winner
			if (userDiceRoll > computerResult) {
				// Add 1 to the user' wins because the user won
				myWins++;
				// Print out the winning result
				System.out.println(
						"You won this round\n\n" + "My wins: " + myWins + "\n" + "Computer wins: " + computerWins);
			} else if (userDiceRoll < computerResult) {
				// Add 1 to the computer' wins because the computer won
				computerWins++;
				// Print out the winning result
				System.out.println(
						"You lost this round\n\n" + "My wins: " + myWins + "\n" + "Computer wins: " + computerWins);
			} else if (userDiceRoll == computerResult) {
				// No one won so no one gets the point
				// Print out the winning result
				System.out.println(
						"No one wins this round\n\n" + "My wins: " + myWins + "\n" + "Computer wins: " + computerWins);
			}

			// Do not run the last round, only 3 time (0 to 2)
			if (rounds < 2) {
				// Ask the user to roll their dice by hitting Enter
				//Use this as a space keeper between rounds
				System.out.println("Please roll your dice, Press Enter to roll");
				blank = userDiceRollKeyboard.nextLine();
			}
		}

		// Close the scanner function
		userDiceRollKeyboard.close();

		// Give the result of who won the best out of 3
		if (computerWins > myWins) {
			// The computer won the best out of 3, print out that the user have lost
			System.out.println("\nThe computer won the best out of 3 rounds.");
		} else if (computerWins < myWins) {
			// The user won the best out of 3, print out that the user did win
			System.out.println("\nYou won the best out of 3 rounds - well done!");
		} else if (computerWins == myWins) {
			// The user and the computer had 3 draws or 1 draw and equal 1 point each - no
			// one won the best out of 3
			System.out.println("\nYou have a draws with the computer.");
		}
	}
}