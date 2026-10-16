package guessingGame;

import java.util.Scanner;

public class GuessNumerApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Game game = new Game();
		
		String playAgain = "y";
		
		game.displayWelcomeMessage();
		
		while
			(playAgain.equalsIgnoreCase("y")) {
			
			game.generateNumberToBeGuessed();
			
			game.displayPleaseGuessMessage();
			
				while (true) {
					
					System.out.print("\nEnter a number between 1 and 100: ");
					int guess = input.nextInt();
					
					game.makeGuess(guess);;
					
					if
						(game.isCorrectGuess()) {
						
						game.displayCorrectGuessMessage();
						
						break;
					} else {
						
						game.displayGuessAgainMessage();
					}
				}
				System.out.print("\nWould you like to play again? (y/n): ");
				playAgain = input.next();
				
				
		}
		System.out.println("Bye - Come back soon!");
		input.close();

	}

}
