package Basics;

public class CheckStudents {

	public static void main(String args[]) {
		//Erstellen des ersten Objektes mit dem ersten Konstruktor
		Student student1 = new Student("Tina", "Smith", 24);
		Student student3 = new Student("Tin", "Smit", 23);
		Student student4 = new Student("Tia", "Smih", 21);
		Student student5 = new Student("Tna", "Smth", 25);
		//Erstellen des zweiten Objektes mit dem zweiten Konstruktor
		Student student2 = new Student();
		//Setzen des Alters für das zweite Objekt
		student2.setAge();
		//Informationensausgabe der Objekte
		student1.prinstStudentInfo();
		student2.prinstStudentInfo();
		System.out.println(student1.getCounter());
	}
}
