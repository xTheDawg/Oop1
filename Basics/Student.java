package Basics;

public class Student {
	//Instanzvariabeln
	private String fname;
	private String lname;
	private int stdage;
	static int counter = 0;
	
	//Erster Konstruktor mit Initialisierung der Instanzvariabeln
	public Student(String firstname, String lastname, int age) {
		this.fname = firstname;
		this.lname = lastname;
		this.stdage = age;
		counter++;
	}
	
	//Zweiter Konstruktor mit Standardwerten für die Instanzvariabeln
	public Student() {
		fname = "John";
		lname = "Doe";
		counter++;
	}
	
	//Methode zur Ausgabe der Daten eines Objekts
	public void prinstStudentInfo() {
		System.out.println("Student " + fname + " " + lname + " is " + stdage + " years old.");
	}
	
	//Methode zum setzen eines Standardalters
	public void setAge() {
		stdage = 22;
	}
	
	public static int getCounter() {
		return counter;
	}
	
}
