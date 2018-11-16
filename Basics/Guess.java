package Basics;
import java.util.Scanner;
import java.util.Random;
public class Guess {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int rndint = rnd.nextInt(10);
		int inp;
		
		Scanner guess = new Scanner(System.in);
		System.out.println("Guess the Number between 0 and 10!");
		do {
			inp = guess.nextInt();
			if(inp > 10 || inp < 0) {
				System.err.println("Input is outside of specified range");
				guess.close();
				System.exit(1);
			}
			if(inp < rndint) {
				System.out.println("Your number is smaller. Try again!");
			}else if(inp > rndint) {
				System.out.println("Your number is bigger. Try again!");
			}else {
				System.out.println("Correct! :D");
			}
		}while(inp != rndint);
		guess.close();
	}
}
