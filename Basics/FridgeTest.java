package Basics;

public class FridgeTest {

	public static void main(String[] args) {
		Fridge fridge1 = new Fridge(0, 5.5);
		fridge1.takeADrink();
		fridge1.fillDrinks(5);
		fridge1.takeMilk(5.6);
		fridge1.takeMilk(3.4);
		System.out.println(fridge1.toString());
		
	}
}
