/*
Countdown,java
E MacNamara
20 4 2020
*/

import javax.swing.*;
import java.util.*;
import java.util.Random;

public class Countdown{
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();

	//variables
	private String[] consonantsArray = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t","v", "w",
		"y", "x", "z" };
	private String[] vowelsArray = { "a", "e", "i", "o", "u" };
	private String[] playerOneArray;//input
	private String[] playerTwoArray;//input
	private String[] keyWordsArray = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "continue",
	"default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "import", "int", "interface",
	"long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strict", "super", "switch",
	"this", "throw", "throws", "transient", "try", "void", "volatile", "while"};//choice of words to make a word with given leters
	private int[] scoreArray;//input
	ArrayList<String> lettersArray = new ArrayList<String>();
	ArrayList<String> wordArray = new ArrayList<String>();
	private String letter;//input
	private String answer;//input
	private int round;//input

	public Countdown(){
		String consonantsArray;
		String vowelsArray;
		String playerOne;
		String playerTwo;
		String keyWords;
		int score;
		ArrayList<String> lettersArray = new ArrayList<String>();
		ArrayList<String> wordArray = new ArrayList<String>();
		int round = 0;
		String letter;
		String answer;
}


//setter
	public void setConsonantsArray (String[] consonantsArray){
		this.consonantsArray=consonantsArray;
	}

	public void setVowelsArray (String[] vowelsArray){
		this.vowelsArray=vowelsArray;
	}

	public void setPlayerOneArray (String[] playerOneArray){
		this.playerOneArray=playerOneArray;
	}

	public void setPlayerTwoArray (String[] playerTwoArray){
		this.playerTwoArray=playerTwoArray;
	}

	public void setkeyWordsArray (String[] keyWordsArray){
		this.keyWordsArray=keyWordsArray;
	}

	public void setScoreArray (int[] scoreArray){
		this.scoreArray=scoreArray;
	}

	public void setRound (int round){
		this.round=round;
	}

	public void setLetter (String letter){
		this.letter=letter;
	}

	public void setAnswer (String answer){
		this.answer=answer;
	}

	//compute
	public void compute(){

		do {
			String roundInput = JOptionPane.showInputDialog(null,"How many rounds do you want to play?");//set rounds for the game
			if(!roundInput.matches("[0-9]+")){//checks if input = 0-9
				JOptionPane.showMessageDialog(null, "You need to enter a valid number.");//if not, asks a user to put in a valid number
				continue;//causes the loop to jump to next iteration of the loop
			}
			round = Integer.parseInt(roundInput);
			break;
		} while(true);//loop keeps going until you break out of it


		for(int i = 0; i <= 3; i++){
			String userInput = JOptionPane.showInputDialog(null,"Do you want a vowel or con?");//giving the palyer a choice to choose letter

			if(userInput.toLowerCase().equals("vowel") || userInput.toLowerCase().equals("con")){
				if (userInput.toLowerCase().equals("vowel")) {
					String vowel = vowelsArray[rand.nextInt(5)];
					lettersArray.add(vowel);
				}
				else if (userInput.toLowerCase().equals("con")) {
					String consonant = consonantsArray[rand.nextInt(21)];
					lettersArray.add(consonant);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Error: Not a valid answer.");//states that if the answer isn't a consonant or vowel, the answer is invalid
			}


		}

		JOptionPane.showMessageDialog(null, lettersArray);


		// Points
		int player1TotalPoints = 0;
		int player2TotalPoints = 0;

		for(int i = 1; i <= round; i++){
			String player1Word = JOptionPane.showInputDialog(null,"Player1: Now make a Java key word using the letters, " +lettersArray);
			JOptionPane.showMessageDialog(null, "You word is: " + player1Word);
			String player2Word = JOptionPane.showInputDialog(null,"Player2: Now make a Java key word using the letters, " +lettersArray);
			JOptionPane.showMessageDialog(null, "You word is: " + player2Word);

			int player1points = 0;
			int player2points = 0;

			if(player1Word.length() > player2Word.length()){
				player1points +=1;
				player1TotalPoints += player1points;
			}

			else{
				player2points +=1;
				player2TotalPoints += player2points;
			}

			JOptionPane.showMessageDialog(null, "Player 1 has scored: " + player1points + "points in round " + i + "\nPlayer 2 has scored: " + player2points + "points in round." + i);
			JOptionPane.showMessageDialog(null, "Player1 Total: " + player1TotalPoints + "\nPlayer2 Total: " + player2TotalPoints);
		}

   }//closes the compute

//getter

	public String[] consonantsArray(){
		return consonantsArray;
	}

	public String[] vowelsArray(){
		return vowelsArray;
	}

	public String[] playerOneArray(){
		return playerOneArray;
	}

	public String[] playerTwoArray(){
		return playerTwoArray;
	}

	public String[] keyWordsArray(){
		return keyWordsArray;
	}

	public int round(){
		return round;
	}

	public String letter(){
		return letter;
	}

	public String answer(){
		return answer;
	}

}
