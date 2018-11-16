package Basics;

public class Cat {
	private String name;
	private int age;
	public Cat(String alias, int years) {
		this.name = alias;
		this.age = years;
		System.out.println("The Cats name is " + alias + " and is " + years + " years old...");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String asdf) {
		this.name = asdf;
	}
}
