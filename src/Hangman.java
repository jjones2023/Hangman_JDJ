import java.util.Scanner;

public class Hangman {
	
	//Instance Fields
	
	Scanner scan = new Scanner(System.in);
	private int wins;
	private int losses;
	private String currentCard;
	private Dictionary dictionary;
	
	//Constructors
	
	/**
	 * This is the default constructor
	 */
	public Hangman() {
		
	}
	
	//Methods
	/**
	 * This method loads the Win/Loss file
	 */
	private void loadWL() {
		
	}
	/**
	 * This method overwrites the current Win/Loss with an updated number
	 */
	private void writeWL() {
		
	}
	/**
	 * This method runs the main loop to process the game
	 */
	public void playGame() {
		int guessCount = 0;
        int correctGuess = 0;
        boolean foundIt;
        boolean solved;
        char guess, answer;
        String word;
        guess = scan.next();
		while (guessCount <= 5) {
	            guess = scan.next();
	            for (int i = 0; i < word.length(); i++) {
	                if (guess == word.charAt(i)) {
	                    correctGuess++;
	                    System.out.println("Correct Guess Count: "
	                                        + correctGuess);
	                    solved = false;
	                }
	                else if (guess != word.charAt(i)) {
	                    guessCount++;
	                    System.out.println("Guess Count: " + guessCount);
	                    solved = false;
	                }
	            }
	            if (correctGuess == word.length()) {
	                solved = true;
	            }                   
	        }
	}
}
