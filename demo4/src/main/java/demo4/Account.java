package demo4;

public class Account {
	private String accNum;
	private String custName;
	private String email;
	private String type;
	private double balance;
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
	}
	public Account(String accNum, String custName, String email, String type, double balance) {
		super();
		this.accNum = accNum;
		this.custName = custName;
		this.email = email;
		this.type = type;
		this.balance = balance;
	}
}
