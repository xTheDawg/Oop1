package Basics;

public class FruitStore {

	private int pineappleCount;
	private int kiwiCount;
	private int appleCount;
	static int fruitStoreCount = 0;
	
	public FruitStore() {
		this.pineappleCount = 10;
		this.kiwiCount = 10;
		this.appleCount = 10;
		fruitStoreCount++;
	}
	
	public void sellAnanas(int numberOfAnanas) {
		this.pineappleCount -= numberOfAnanas;
	}
	
	public void sellKiwi(int numberOfKiwi) {
		this.kiwiCount -= numberOfKiwi;
	}
	
	public void sellApfel(int numberOfApfel) {
		this.appleCount -= numberOfApfel;
	}
	
	public void fillUp(int numberOfAnanas, int numberOfKiwis, int numberOfApples) {
		this.pineappleCount += numberOfAnanas;
		this.kiwiCount += numberOfKiwis;
		this.appleCount += numberOfApples;
	}
	
	public String toString() {
		String a = "Lagerbestand:\n Ananas: " + this.pineappleCount + " Kiwi: " + this.kiwiCount + " Apfel: " + this.appleCount;
		return a;
	}
	
	public String counter() {
		String a = "Counter: " + this.fruitStoreCount;
		return a;
	}
}
