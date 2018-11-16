package Basics;
/** A simple cash register that totals up purchases and computes change. */
public class CashRegisterSimple {
  
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

  /**
   * Finish purchase and return change.
   * 
   * @return change due to customer
   */
  public double giveChange() {
    double change = payment - purchase;
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
  
  public void priceAmount() {
	  System.out.println("Your Purchase costs: " + purchase);
  }
  
  public void paymentAmount() {
	  System.out.println("You paid: " + payment);
  }
  
}
