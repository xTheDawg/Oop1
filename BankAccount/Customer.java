package BankAccount;
public class Customer {

	private String customerName;
	private String customerAddress;
	private Bankaccount bankAccount;
	
	public Customer(String customerName, String customerAddress ) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public int createBankAccount(String bankAccountName, double initialBalance) {
		this.bankAccount = new Bankaccount(bankAccountName, initialBalance);
		return bankAccount.getId();
	}
	
	public Bankaccount getBankAccount() {
		return this.bankAccount;
	}
}
