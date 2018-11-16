package Basics;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.DateTimeException;
public class CalculateAge {
	
	private static int year;
	private static int month;
	private static int day;
	private static int i;

	
	public static void main(String[] args) {

		Scanner myBirthday = new Scanner(System.in);
		System.out.println("Please provide the year, month and day you were born. Press [Enter] between your inputs.");
		try {
			for(i = 0; i < 3; i++) {
				int input = myBirthday.nextInt();
				if(i == 0) {
					year = input;
				} else if(i == 1) {
					month = input;
				} else if(i == 2) {
					day = input;
				}
			}
		}catch(InputMismatchException e){
			System.err.println("Invalid Input, only Integer Values are allowed! Error: " + e.getMessage());
			System.exit(1);
		}
		myBirthday.close();
		try {
			LocalDate birthDate = LocalDate.of(year, month, day);
			System.out.println("Your Birthday is: " + day + "/" + month + "/" + year);
			System.out.println("Today is: " + LocalDate.now());
			System.out.println("You are " + ChronoUnit.DAYS.between(birthDate, LocalDate.now()) + " days old.");
		}catch(DateTimeException e) {
			System.err.println("Invalid Input! Error:\n" + e.getMessage() + "\nexiting...");
			System.exit(1);
		}
	}
}
