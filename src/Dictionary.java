import java.security.SecureRandom;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary {
	private String[] wordList;
	private int currentCard;
	private SecureRandom randomNumbers;
	
	SecureRandom rand = new SecureRandom();
	
	public Dictionary(String wordList) {
		
	}
	private void readFile(String wordList) {
		File f = new File("wordList.txt");
	}
	public String chooseWord() {
		int index = rand.nextInt(200);
		return wordList[index];
	}
}
