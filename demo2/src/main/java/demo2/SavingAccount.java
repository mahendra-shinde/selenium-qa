package demo2;

public class SavingAccount extends Account{
	private float interestRate;

	public SavingAccount(String accNumber, String accHolderName, double balance, float interestRate) {
		super(accNumber, accHolderName, balance);
		this.interestRate = interestRate;
		System.out.println("Creating a new SavingAccount");
	}
	
}
