package prime;

//Import the scanner function
import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {

		// Welcome message ask asking the user for an input
		System.out.println(
				"Welcome to the prime number testing program. \n \nPlease enter a positive number to test if it is a prime number:");
		// Get the user input
		Scanner userInputKeyboard = new Scanner(System.in);
		// Store the integer input
		int userInput = userInputKeyboard.nextInt();
		// Close the scanner function
		userInputKeyboard.close();

		// Determine if the value entered is a prime number
		// If it is equal to 1,2 or 3 - it is a prime number
		if ((userInput == 1) || (userInput == 2) || (userInput == 3)) {
			// Print out that it is a prime number
			System.out.println("The number " + userInput + " is a prime number.");
		} else if (((userInput + 1) % 6) == 0) {
			// If the number + 1 is modulus 6 - Print out that it is a prime number
			System.out.println("The number " + userInput + " is a prime number.");
		} else if (((userInput - 1) % 6) == 0) {
			// If the number + 1 is modulus 6 - Print out that it is a prime number
			System.out.println("The number " + userInput + " is a prime number.");
		} else {
			// If non of the above conditions are met - Print out that it is Not a prime number
			System.out.println("The number " + userInput + " is NOT a prime number.");
		}
	}
}