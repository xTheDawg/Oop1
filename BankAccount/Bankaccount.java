package BankAccount;
import java.util.Random;

public class Bankaccount {

	private String bankAccountName;
	private int bankAccountId;
	private double balance;
	
	public Bankaccount(String bankAccountName, double balance) {
		this.bankAccountName = bankAccountName;
		this.balance = balance;
	}
	
	public void putMoney(double amount) {
		this.balance += amount;
	}
	
	public void getMoney(double amount) {
		this.balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getId() {
		Random rnd = new Random();
		this.bankAccountId = rnd.nextInt(10001);
		return this.bankAccountId;
	}
}
