package demo2;

public class Account {
	private String accNumber;
	private String accHolderName;
	private double balance;
	
	public Account(String accNumber, String accHolderName, double balance) {
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
		System.out.println("Creating a new Account");
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void debit(double amt) {
		balance -= amt;
	}
	
	public void credit(double amt) {
		balance += amt;
	}
	
}

