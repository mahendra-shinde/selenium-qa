package demo4;

public class LoopDemo3 {

	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		accounts[0]= new Account("SB0001", "Vishal", "vish1234@xyz.com", "Savings", 1200.40);
		accounts[1]= new Account("SB0002", "Ajay", "aja1234@xyz.com", "Savings", 1400.40);
		accounts[2]= new Account("SB0003", "Kushal", "kush1234@xyz.com", "Savings", 1980.0);
		accounts[3]= new Account("SB0004", "Ayush", "ayu4@xyz.com", "Savings", 23400.0);
		accounts[4]= new Account("SB0005", "Kiran", "kiran24@xyz.com", "Savings", 18890.40);
		
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i].getCustName()+" "+accounts[i].getBalance());	
		}
		
		for(Account a : accounts ) {
			System.out.println(a.getCustName()+" "+a.getBalance());
		}
		
	}

}
