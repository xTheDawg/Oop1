package Basics;

public class ExtendedCashRegister {
	  private double purchase;
	  private double payment;

	  /**
	   * Record purchase of an item.
	   * 
	   * @param amount price of the item
	   */
	  public void recordPurchase(double amount) {
	    purchase = purchase + amount;
	  }

	  /**
	   * Process cash payment.
	   * 
	   * @param dollars number of dollars (bills)
	   * @param quarters number of quarters
	   * @param dimes number of dimes
	   * @param nickels number of nickels
	   * @param pennies number of pennies
	   */
	  public void payCash(int dollars, int quarters, int dimes, int nickels, int pennies) {
	    this.payment = dollars + 0.25 * quarters + 0.1 * dimes + 0.05 * nickels
	        + 0.01 * pennies;
	  }
	  
	  public void payDollars(int dollars) {
		  this.payment += dollars;
	  }
	  
	  public void payQuarters(int quarters) {
		  this.payment += (quarters * 0.25);
	  }
	  
	  public void payDimes(int dimes) {
		  this.payment += (dimes * 0.1);
	  }
	  
	  public void payNickles(int nickles) {
		  this.payment += (nickles * 0.05);
	  }
	  
	  public void payPennies(int pennies) {
		  this.payment += (pennies * 0.01);
	  }

	  /**
	   * Finish purchase and return change.
	   * 
	   * @return change due to customer
	   */
	  public double giveChange() {
	    double change = 0.01 * Math.round(100* (payment - purchase));
	    purchase = 0.0;
	    payment = 0.0;
	    return change;
	  }

	  /**
	   * Change dollars to quarters.
	   * 
	   * @param dollars amount in dollars to change
	   * @return number of quarters
	   */
	  public double changeToQuarters(int dollars) {
	    return dollars / 0.25;
	  }
}
