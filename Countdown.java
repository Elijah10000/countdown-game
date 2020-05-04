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
	ArrayList<String> lettersArray = new ArrayList<String>();
	private String letter;//input
	private String answer;//input
	private int round;//input
	private String userInput;//input


	public Countdown(){
		ArrayList<String> lettersArray = new ArrayList<String>();
		int round = 0;
		String consonant;
		String vowel;
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

	public void setRound (int round){
		this.round=round;
	}

	public void setLetter (String letter){
			this.letter=letter;
	}

	//compute
	public void compute(){

		round = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rounds do you want to play?"));//set rounds for the game

		for(int i = 0; i <= 9; i++){
			String userInput = JOptionPane.showInputDialog(null,"Okay, now choose either a vowel or Const.");//giving the palyer a choice to choose letter

			if (userInput.toLowerCase().equals("vowel")) {
				String vowel = vowelsArray[rand.nextInt(5)];
				System.out.println(vowel);
				lettersArray.add(vowel);
			}

			else if (userInput.toLowerCase().equals("const")) {
				String consonant = consonantsArray[rand.nextInt(21)];
				lettersArray.add(consonant);
			}
		}

		JOptionPane.showMessageDialog(null, lettersArray);

   }//closes the compute

//getter

	public String[] consonantsArray(){
		return consonantsArray;
	}

	public String[] vowelsArray(){
		return vowelsArray;
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