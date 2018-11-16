package BankAccount;
import java.util.Scanner;
public class BankaccountCLI {

	private static String option;
	
	public static void main(String[] args) {		
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Create a new Account");
		System.out.println("Write your name:");
		String name = scanner1.next();
		System.out.println("Write your address");
		String address = scanner2.next();
		Customer customer1 = new Customer(name, address);
		System.out.println("Type of the account");
		String type = scanner1.next();
		System.out.println("Initial balance");
		double init = scanner2.nextDouble();
		System.out.println("Your account has been created with id: " + customer1.createBankAccount(type, init));
		do {
			double amount;
			System.out.println("Type an option.. (Balance, Put, Withdraw, Exit");
			option = scanner1.next();
			if(option.equalsIgnoreCase("balance")) {
				System.out.println("Your account currently holds..." + customer1.getBankAccount().getBalance());
			}else if(option.equalsIgnoreCase("put")) {
				System.out.println("Amount to put");
				amount = scanner2.nextDouble();
				customer1.getBankAccount().putMoney(amount);
			}else if(option.equalsIgnoreCase("withdraw")) {
				System.out.println("Amount to withdraw");
				amount = scanner2.nextDouble();
				customer1.getBankAccount().getMoney(amount);
			}else if(option.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.err.println("Invalid option entered");
			}
		} while(option.equalsIgnoreCase("exit") == false);
		scanner1.close();
		scanner2.close();
		System.out.println("Exiting...");
		System.exit(0);
	}
}
