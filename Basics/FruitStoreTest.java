package Basics;

public class FruitStoreTest {

	public static void main(String[] args) {
		FruitStore store1 = new FruitStore();
		store1.sellAnanas(5);
		store1.sellKiwi(3);
		store1.sellApfel(7);
		//P=5;K=7;A=3;
		store1.fillUp(3, 1, 5);
		//P,K,A = 8
		System.out.println(store1.toString());
		System.out.println(store1.counter());
		FruitStore store2 = new FruitStore();
		System.out.println(store1.counter());
		System.out.println(store2.counter());
	}
}
