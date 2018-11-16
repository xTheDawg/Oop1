package Basics;
/***
 * This program tells us how to say "Hi" to people, depending in which city we are.
 * @author kurpicz
 *
 */
import java.util.Scanner;

public class Simplify {
  public static void main(String[] args) {

	  String city;
	  Scanner scan1 = new Scanner(System.in);
	  System.out.println("Which city do you want to visit?");
	  city = scan1.nextLine();
	  scan1.close();


    // TODO: Read the city from the console using a Scanner

    if (city.equalsIgnoreCase("Berlin") || city.equalsIgnoreCase("Bern")) {
      System.out.println("Guten Tag!");
    } else if (city.equalsIgnoreCase("London") || city.equalsIgnoreCase("Boston")) {
      System.out.println("Hello!");
    } else if (city.equalsIgnoreCase("Paris")) {
      System.out.println("Bonjour!");
    } else if (city.equalsIgnoreCase("Milano")) {
      System.out.println("Ciao!");
    } else if (city.equalsIgnoreCase("Madrid")) {
      System.out.println("Hola");
    } else {
    	System.out.println("I don't know that city but i bet it's a great city!");
    }
  }
}
