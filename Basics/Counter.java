package Basics;

public class Counter {
	final int constant = 0;
	private int value = constant;
	
	public Counter() {
	}
	
	public int getValue() {
		return value;
	}
	
	public void countUp() {
		value = value + 1;
	}
	
	public void reset() {
		value = constant;
	}
}
