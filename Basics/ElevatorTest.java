package Basics;
import java.util.Scanner;
public class ElevatorTest {

	int goTo;
	static int stck;
	
	public static void main(String[] args) {
		Scanner stockwerk = new Scanner(System.in);
		System.out.println("In welches Stockwerk möchten Sie gehen");
		int goTo = stockwerk.nextInt();
		if(goTo > 13) {
			stck = goTo -1;
		} else {
			stck = goTo;
		}
		System.out.println("Sie fahren tatsächlich in den: " + stck + ". Stock");
		stockwerk.close();
	}
	
}
