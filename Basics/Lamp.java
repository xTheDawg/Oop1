package Basics;

public class Lamp {
	private String state;
	public Lamp(String status) {
		if(status == "off" || status == "on") {
		this.state = status;
		}
		else
		{
			System.out.println("An error occured! Invalid Input.");
			this.state = "off";
		}
	}
	
	public String getState() {
		return state;
	}
	
	public void turnOn() {
		state = "on";
	}
	
	public void turnOff() {
		state = "off";
	}
}
