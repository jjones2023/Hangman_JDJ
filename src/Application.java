/**
 * 
 * @author David Jones
 *@version 1.0
 *
 */

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Hangman game = new Hangman();
		Scanner scan = new Scanner(System.in);
		
		String guessedLetters = "";
		String secretWord = dictionary.chooseWord();
		int incorrectGuesses = 5;
		
		game.playGame();
		
		System.out.println("Would you like to play? Y/N");
		String Answer = "";
		while(guessedLetters != secretWord) {
			if(Answer.equalsIgnoreCase("Y")) {
				System.out.print("You have " +incorrectGuesses+ "incorrect guesses left");
			}
		}
		
		
	}

}
