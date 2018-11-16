package Basics;

public class LampTester {
	public static void main(String[] args) {
		Lamp myLamp = new Lamp("on");
		System.out.println(myLamp.getState() + ", this is the initial state");
		myLamp.turnOn();
		System.out.println(myLamp.getState() + ", expected was on");
		myLamp.turnOff();
		System.out.println(myLamp.getState() + ", expected was off");
		System.out.println(-Integer.MIN_VALUE);
	}
}
