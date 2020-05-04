/*
CountdownApp,java
E MacNamara
20 4 2020
*/

import javax.swing.*;//asking the question using JOptionPane
import java.util.*;//choosing random letters
import java.util.Random;

	public class CountdownApp{
		public static void main (String args[]){

	String lettersArray[];
	int round;

	Random r = new Random();
	char c = (char)(r.nextInt(26) + 'a');

	StringBuilder letterRandomizer = new StringBuilder();

	Scanner scan;
	Countdown myCountdown;

	scan = new Scanner(System.in);
	myCountdown=new Countdown ();

	//compute
	myCountdown.compute();

}
	}