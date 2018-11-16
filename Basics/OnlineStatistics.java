package Basics;

public class OnlineStatistics {

	private int initial;
	private int total;
	private int count;
	private double average;
	private int max = Integer.MIN_VALUE;
	private int min = Integer.MAX_VALUE;
	
	public OnlineStatistics(int initialValue) {
		if(initialValue > Integer.MAX_VALUE || initialValue < Integer.MIN_VALUE) {
			System.out.println("Wert nicht erlaubt");
		}else {
			this.initial = initialValue;
			this.total = initialValue;
			this.count = 0;
		}
	}
	
	public void addValue(int value) {
		long bigValue = value;
		if(bigValue >= Integer.MAX_VALUE || bigValue <= Integer.MIN_VALUE) {
			System.out.println("Wert nicht erlaubt");
		}else {
			bigValue = this.total + value;
			if(bigValue > Integer.MAX_VALUE || bigValue < Integer.MIN_VALUE) {
				System.out.println("Neues Total ist ausserhalb des zulässigen Bereiches");
			}else {
				this.total += value;
				count++;
				if(value > this.max) {
					this.max = value;
				}
				if(this.min == 0) {
					this.min = value;
				}
				if(value < this.min) {
					this.min = value;
				}
			}
		}
	}
	
	public int getSum() {
		return this.total;
	}
	
	public double getAverage() {
		this.average = (this.total - this.initial) / this.count;
		return this.average;
	}
	
	public int getMax() {
		return this.max;
	}
	
	public int getMin() {
		return this.min;
	}
	
	public void reset() {
		this.total = 0;
		this.count = 0;
		this.average = 0;
		this.max = 0;
		this.min = 0;
	}
}
