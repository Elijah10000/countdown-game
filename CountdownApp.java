/*
CountdownApp,java
E MacNamara
20 4 2020
*/

import javax.swing.*;//asking the question using JOptionPane
import java.util.*;//choosing random letters
import java.util.Random;//importing the random package to allow for randomisation

	public class CountdownApp{
		public static void main (String args[]){

	String lettersArray[];
	String wordArray[];
	int round;

	Random r = new Random();
	char c = (char)(r.nextInt(26));

	StringBuilder letterRandomizer = new StringBuilder();

	Countdown myCountdown;
	myCountdown=new Countdown ();

	//compute
	myCountdown.compute();

}
	}