package Basics;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	  public static void main(String[] args) {
		    
		  Scanner scanner = new Scanner(System.in);
		    System.out.println("Welcome to the Order application!");

		      System.out.print(
		          "Press 1 for pizza, press 2 for burger and press 3 for sushi");
		      try {
		      int input = scanner.nextInt();
		      if (input == 1) {
		        System.out.println("Here is your pizza!");
		      } else if (input == 2) {
		        System.out.println("Here is your burger!");
		      } else if (input == 3) {
		        System.out.println("Here is your sushi!");
		      } else {
		    	System.err.println("You didn't type 1,2 or 3... Exiting.");  
		      }
		      }catch(InputMismatchException e){
					System.err.println("Invalid Input, only Integer Values are allowed! Error: " + e.getMessage());
					System.exit(1);
			  }
		    scanner.close();
		  }
}
