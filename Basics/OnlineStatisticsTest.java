package Basics;

public class OnlineStatisticsTest {

	public static void main(String[] args) {
		OnlineStatistics stat1 = new OnlineStatistics(100);
		stat1.addValue(30);
		stat1.addValue(60);
		stat1.addValue(30);
		stat1.addValue(60);
		stat1.addValue(30);
		stat1.addValue(60);
		System.out.println("Current Sum: " + stat1.getSum());
		System.out.println("Average Value added: " + stat1.getAverage());
		System.out.println("Highest Value added: " + stat1.getMax());
		System.out.println("Lowest Value added: " + stat1.getMin());
		stat1.reset();
		stat1.addValue(2147483647); //MAX INT
		stat1.addValue(1);
		System.out.println("Current Sum: " + stat1.getSum());
		stat1.reset();
		stat1.addValue(-2147483648); //MIN INT
		stat1.addValue(-1);
		System.out.println("Current Sum: " + stat1.getSum());
	}
}
