package Basics;

public class Fridge {

	private int drinks;
	private double milkL;

	public Fridge(int drinksAmount, double milkAmount) {
		this.drinks = drinksAmount;
		this.milkL = milkAmount;
	}
	
	public void takeADrink() {
		if (this.drinks < 1) {
			System.err.println("No drinks in the Fridge");
		}else {
			this.drinks -= 1;
		}
	}
	
	public void takeMilk(double litersOfMilk) {
		double check = this.milkL - litersOfMilk;
		if (check < 0) {
			System.err.println("Not enough Milk available. Currently: " + this.milkL + " Liters");
		}else {
			this.milkL -= litersOfMilk;
		}
	}
	
	public void fillDrinks(int amount) {
		this.drinks += amount;
	}
	
	public void fillMilk(double amount) {
		this.milkL += amount;
	}
	
	public String toString() {
		String ret = "Amount of drinks in the fridge: " + this.drinks + "\n" + "Liters of Milk in the Fridge: " + this.milkL;
		return ret;
	}
}
