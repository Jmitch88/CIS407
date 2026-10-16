package guessingGame;

import java.util.Random;

public class Game {

	private int number;
	private int guessNumber;
	private int counter;
	
	public void generateNumberToBeGuessed() {
		Random rand = new Random();
		number = rand.nextInt(100) + 1;
		counter = 0;
	}
	
	public void makeGuess(int guessNumber) {
		this.guessNumber = guessNumber;
		counter++;
	}
	
	public boolean isCorrectGuess() {
		return guessNumber == number;
	}
	
	public void displayWelcomeMessage() {
		System.out.println("Welcome to the Guess the Number Game");
		
	System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public void displayPleaseGuessMessage() {
		System.out.println("\nI'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.");
	}
	
	public void displayCorrectGuessMessage() {
		System.out.println("You got it in " + counter + " tries.");
		
		if (counter <= 3) {
			System.out.println("Great work! You are a mathematical wizard.");
		} else if (counter >= 4 && counter <= 7) {
			System.out.println("Not too bad! You've got some potential.");
		} else {
			System.out.println("What took you so long?");
		}
	}
	
	public void displayGuessAgainMessage() {
		
		if (guessNumber > number) {
			
			if (guessNumber - number > 10) {
				
				System.out.println("Way too high! Guess again.");
			} else {
				System.out.println("Too high! Guess again.");
			}
			
		} else {
			
			if (number - guessNumber > 10) {
				System.out.println("Way too low! Guess again.");
			} else {
				System.out.println("Too low! Guess again.");
			}
		}
	}

}
