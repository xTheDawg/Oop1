package Basics;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		double taxes1 = TaxCalculator.calculateTax(90000.00, TaxCalculator.Status.MARRIED);
		System.out.printf("taxes: %.0f\n", taxes1);
		
		double taxes2 = TaxCalculator.calculateTax(50000.00, TaxCalculator.Status.MARRIED);
		System.out.printf("taxes: %.0f\n", taxes2);
		
		double taxes3 = TaxCalculator.calculateTax(40000.00, TaxCalculator.Status.SINGLE);
		System.out.printf("taxes: %.0f\n", taxes3);
		
		double taxes4 = TaxCalculator.calculateTax(20000.00, TaxCalculator.Status.SINGLE);
		System.out.printf("taxes: %.0f\n", taxes4);
	
		double expectedTaxes1 = 12900;
		double expectedTaxes2 = 5000;
		double expectedTaxes3 = 5200;
		double expectedTaxes4 = 2000;
		final double epsilon = 1e-14;

		if(Math.abs(taxes1 - expectedTaxes1) < epsilon) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if(Math.abs(taxes2 - expectedTaxes2) < epsilon) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if(Math.abs(taxes3 - expectedTaxes3) < epsilon) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if(Math.abs(taxes4 - expectedTaxes4) < epsilon) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
