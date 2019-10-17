package co.grandcircus;
import java.util.Random;
import java.util.Scanner;
public class DiceRoller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		char userReply;
		do {
		System.out.println("Welcome to the Dice Random Number Generator!");
		System.out.println("Please enter the number of sides you would like your dice to have: ");
		int dieSides = scan.nextInt();
		System.out.println("Alright, " + dieSides + " sided die it is then...");
		int die1 = generateRandomDieRoll(dieSides);
		int die2 = generateRandomDieRoll(dieSides);
		if (die1 == 0) {
			die1 = generateRandomDieRoll(dieSides);
		}
		if (die2 == 0 ) {
			die2 = generateRandomDieRoll(dieSides);
		}
		if (die1 == 1 && die2 == 1) {
			System.out.println("Man, that is unfortunate you rolled snake eyes...");
		}
		else if (die1 == 6 && die2 == 6) {
			System.out.println("Wow, you rolled a boxcar!");
		}
		else {
		System.out.println("Your die came out to be a " + die1 + " as well as a " + die2  + ".");
		}
		System.out.println("Would you like to continue? (y/n) ");
	    userReply = scan.next().charAt(0);
	    } while (userReply == 'y');
		System.out.println("Good-Bye!");
		scan.close();
	}
	
	public static int generateRandomDieRoll(int dieSides) {
		Random rand = new Random(); 
		int randRoll1 = rand.nextInt(dieSides + 1);  
        	return randRoll1; 
	}

}
