package Basics;

public class TroubleShoot {

	public static void main(String[] args) {
	    double a = 1.9;
	    double b = 2.4;
	    double c = Math.ceil(b);
	    double d = Math.floor(a);
	    final double EPSILON = 1E-14;

	    for (int i = 2; i < 10; i = i + 2) {
	      if (Math.abs(a - b) <= EPSILON) {
	        System.out.println("Apple " + d);
	      } else {
	        System.out.println("Ananas " + c);
	      }
	    }
	}
}
